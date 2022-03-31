import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;


class Student_1 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student_1(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년, %d반, %3d점]",
                name, isMale ? "남" : "여", hak, ban, score);
    }

    enum Level {HIGH, MID, LOW}
}


public class Ex14_18 {
    public static void main(String[] args) {

        Student_1[] stuArr = {
            new Student_1("나자바", true, 1, 1, 300),
            new Student_1("김지미", false, 1, 1, 250),
            new Student_1("김자바", true, 1, 1, 200),
            new Student_1("이지미", false, 1, 2, 150),
            new Student_1("남자바", true, 1, 2, 100),
            new Student_1("안지미", false, 1, 2, 50),
            new Student_1("황지미", false, 1, 3, 100),
            new Student_1("강지미", false, 1, 3, 150),
            new Student_1("이자바", true, 1, 3, 200),
            new Student_1("나자바", true, 2, 1, 300),
            new Student_1("김지미", false, 2, 1, 250),
            new Student_1("김자바", true, 2, 1, 200),
            new Student_1("이지미", false, 2, 2, 150),
            new Student_1("남자바", true, 2, 2, 100),
            new Student_1("안지미", false, 2, 2, 50),
            new Student_1("황지미", false, 2, 3, 100),
            new Student_1("강지미", false, 2, 3, 150),
            new Student_1("이자바", true, 2, 3, 200),
        };


        System.out.printf("1. 단순분할(성별로 분할)\n");
        Map<Boolean, List<Student_1>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student_1::isMale));

        List<Student_1> maleStudent = stuBySex.get(true);
        List<Student_1> femaleStudent = stuBySex.get(false);

        for(Student_1 s : maleStudent) System.out.println(s);
        for(Student_1 s : femaleStudent) System.out.println(s);

        // -------------------------------------------------------------

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수)\n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student_1::isMale, counting()));

        System.out.println("남학생 수 : " + stuNumBySex.get(true));
        System.out.println("여학생 수 : " + stuNumBySex.get(false));

        // -------------------------------------------------------------

        System.out.printf("%n3. 단순분할 + 통계(성별 1등)\n");
        Map<Boolean, Optional<Student_1>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student_1::isMale,
                        maxBy(comparingInt(Student_1::getScore))
                ));
        System.out.println("남학생1등 : " + topScoreBySex.get(true));
        System.out.println("여학생1등 : " + topScoreBySex.get(false));

        // -------------------------------------------------------------

        System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)\n");

        Map<Boolean, Map<Boolean, List<Student_1>>> failedStuBySex =
                Stream.of(stuArr)
                        .collect(partitioningBy(Student_1::isMale, partitioningBy(s -> s.getScore() <= 100)));

        List<Student_1> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student_1> failedFemaleStu = failedStuBySex.get(false).get(true);

        System.out.println(failedMaleStu);
        System.out.println(failedFemaleStu);

        // -------------------------------------------------------------

        System.out.println();
        System.out.println("5. 추가 엑스트라");

        Map<Integer, List<Student_1>> stuByBan = Stream.of(stuArr)
                .collect(groupingBy(Student_1::getBan, toList()));

        System.out.println("1 = " + stuByBan.get(1));

    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;



public class Ex14_19 {
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

        System.out.printf("1. 단순그룹화(반별로 그룹화)\n");
        Map<Integer, List<Student_1>> stuByBan = Stream.of(stuArr)
                .collect(groupingBy(Student_1::getBan));

        for(List<Student_1> ban : stuByBan.values()) {
            for(Student_1 s : ban) {
                System.out.println(s);
            }
        }

        // -----------------------------------------------------------------------

        System.out.printf("%n2. 단순그룹화(성적별로 그룹화)\n");
        Map<Student_1.Level, List<Student_1>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if(s.getScore() >= 200) return Student_1.Level.HIGH;
                    else if (s.getScore() >= 100) return Student_1.Level.MID;
                    else return Student_1.Level.LOW;
                        })
                );

        TreeSet<Student_1.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for(Student_1.Level key : keySet) {
            System.out.println("[" + key + "]");

            for(Student_1 s : stuByLevel.get(key))
                System.out.println(s);
            System.out.println();
        }

        // ----------------------------------------------------------------

        System.out.printf("\n3. 단순그룹화 + 통계(성적별 학생수)\n");

        Map<Student_1.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(
                        s -> {
                            if (s.getScore() >= 200) return Student_1.Level.HIGH;
                            else if (s.getScore() >= 100) return Student_1.Level.MID;
                            else return Student_1.Level.LOW;
                        },
                        counting()
                ));

        for (Student_1.Level key : stuCntByLevel.keySet())
            System.out.printf("[%s] - %d명",key, stuCntByLevel.get(key));
        System.out.println();

        // ------------------------------------------------

        System.out.printf("\n4. 다중그룹화(학년별, 반별)");
        Map<Integer, Map<Integer, List<Student_1>>> stuByHakAndBan =
                Stream.of(stuArr)
                        .collect(groupingBy(Student_1::getHak,
                                groupingBy(Student_1::getBan))
                        );

        for(Map<Integer, List<Student_1>> hak : stuByHakAndBan.values()) {
            for(List<Student_1> ban : hak.values()) {
                System.out.println();
                for(Student_1 s : ban)
                    System.out.println(s);
            }
        }


        // -------------------------------------------------------

        System.out.printf("\n5. 다중그룹화 + 통계(학년별, 반별 1등)\n");
        Map<Integer, Map<Integer, Student_1>> topStuByHakAndBan =
                Stream.of(stuArr)
                        .collect(
                                groupingBy(Student_1::getHak,
                                groupingBy(Student_1::getBan,
                                        collectingAndThen(maxBy(comparingInt(
                                                Student_1::getScore
                                        )), Optional::get)
                                ))
                        );

        for(Map<Integer, Student_1> ban : topStuByHakAndBan.values())
            for(Student_1 s : ban.values())
                System.out.println(s);


        // --------------------------------------------------------

        System.out.printf("\n5. 다중그룹화 + 통계(학년별, 반별 성적그룹)\n");
        Map<String, Set<Student_1.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(s -> s.getHak() + "-" + s.getBan(),
                        mapping(s -> {
                            if(s.getScore() >= 200) return Student_1.Level.HIGH;
                            else if (s.getScore() >= 100) return Student_1.Level.MID;
                            else return Student_1.Level.LOW;},
                                toSet())
                        )
                );

        Set<String> keySet2 = stuByScoreGroup.keySet();

        for(String key : keySet2) {
            System.out.println("["+key+"]" + stuByScoreGroup.get(key));
        }
    }
}

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_10 {
    public static void main(String[] args) {
        Stream<Student11> studentStream = Stream.of(
                new Student11("이자바", 3, 300),
                new Student11("김자바", 1, 200),
                new Student11("안자바", 2, 100),
                new Student11("박자바", 2, 150),
                new Student11("소자바", 1, 200),
                new Student11("나자바", 3, 290),
                new Student11("감자바", 3, 180)
        );

        studentStream.sorted(Comparator.comparing((Student11 s) -> s.getBan()).reversed()
                        .thenComparing(Student11::compareTo))
                .forEach(System.out::println);

        
    }
}

class Student11 implements Comparable<Student11> {

    String name;
    int ban;
    int totalScore;

    public Student11(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public int getBan() {
        return ban;
    }

    @Override
    public String toString() {
        return "Student11{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    @Override
    public int compareTo(Student11 o) {
        return o.totalScore - this.totalScore;
    }
}
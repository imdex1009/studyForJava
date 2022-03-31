import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Ex14_17 {
    public static void main(String[] args) {
        StudentTest[] studentTests = new StudentTest[]{
                new StudentTest("홍두식", PersonTest.Gender.MALE, 3, 2),
                new StudentTest("이자바", PersonTest.Gender.FEMALE,  1, 1),
                new StudentTest("아자바", PersonTest.Gender.MALE,2, 11)
        };


        List<String> names = Stream.of(studentTests)
                .map(StudentTest::getName)
                .collect(toList());

        ArrayList<String> list = names.stream()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);

//        Stream<PersonTest> personStream = Stream.of(
//                new PersonTest("안두식"),
//                new PersonTest("janme"),
//                new PersonTest("max"),
//                new PersonTest("john")
//        );
//
//        Stream<PersonTest> personStream2 = Stream.of(
//                new PersonTest("안두식"),
//                new PersonTest("janme"),
//                new PersonTest("max"),
//                new PersonTest("john")
//        );


//        Map<String, PersonTest> map = personStream
//                .collect(Collectors.toMap(p -> p.getRegId(), p -> p));
//        System.out.println(map);



//        PersonTest[] arr = personStream2.toArray(PersonTest[]::new);
//
//        for(PersonTest p : arr)
//            System.out.println(p);

        Stream<PersonTest> personStream = Stream.of(
                new PersonTest("jane", PersonTest.Gender.MALE),
                new PersonTest("jone", PersonTest.Gender.MALE),
                new PersonTest("make", PersonTest.Gender.FEMALE),
                new PersonTest("kuk", PersonTest.Gender.FEMALE)
        );

        Map<Boolean, List<PersonTest>> perBySex = personStream
                .collect(partitioningBy(PersonTest::isMale));
        List<PersonTest> male = perBySex.get(true);
        List<PersonTest> female = perBySex.get(false);

        System.out.println(male);
        System.out.println(female);

    }
}

class StudentTest extends PersonTest{
    int ban;
    int no;

    public StudentTest(String name, int ban, int no) {
        super(name);
        this.ban = ban;
        this.no = no;
    }


    public StudentTest(String name, Gender gender, int ban, int no) {
        super(name, gender);
        this.ban = ban;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getNo() {
        return no;
    }
}

class PersonTest {
    String RegId = UUID.randomUUID().toString();
    String name;
    Gender gender;
    enum Gender {
        MALE(1), FEMALE(0);

        private final int value;
        Gender(int value) {this.value = value;}

    }

    public PersonTest(String name) {
        this.name = name;
    }

    public PersonTest(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getRegId() {
        return RegId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonTest{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isMale() {
        return gender == Gender.MALE;
    }
}
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.List;

//@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
class Ex12_14 {
    public static void main(String[] args) {
        // Ex12_8의 Class 객체를 얻는다.
        Class<Ex12_14> cls = Ex12_14.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);


        System.out.println("anno.testedBy()="+anno.testedBy());
        System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());

        for(String str : anno.testTools())
            System.out.println("testTools="+str);

        System.out.println();

        Annotation[] annoArr = cls.getAnnotations();

        for (Annotation a : annoArr) {
            System.out.println(a);
        }
    }
}


@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count() default 1;
    String testedBy();
    String[] testTools() default "JUnit";
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
    String yymmdd();
    String hhmmss();
}


enum TestType {FIRST, FINAL}


class Modum {
    public int number;
    public int key;
    public static final int SPECIAL = 0;

    public Modum(int number, int key) {
        this.number = number;
        this.key = key;
    }
}
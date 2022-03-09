
import java.util.*;

public class Ex11_14 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 10));

        System.out.println(set);

    }
}

class Person2 {
    String name;
    int age;

    Person2(){this(null, 0);}

    Person2(String name){this(name, 0);}

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {return name + ":" + age;}
    
    public boolean equals(Object obj) {
        if(!(obj instanceof Person2)) return false;
        Person2 p = (Person2)obj;
        return name.equals(p.name) && age == p.age;
    }
    
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

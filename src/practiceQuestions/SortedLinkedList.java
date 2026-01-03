package practiceQuestions;

import java.util.*;

public class SortedLinkedList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(new Person("John", 28),
                new Person("joe", 25),
                new Person("Tom", 23)));
        list.sort(Comparator.comparingInt(Person::getAge));
        for(Person person : list){
            System.out.println(person.getName()+" - "+person.getAge());
        }
    }

}
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

package Java_Java8_Programs.Collections;

import java.util.*;

public class ComparatorInterface {

    private String name;
    private int age;

    public ComparatorInterface(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "ComparatorInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main{
    public static void main(String[] args) {
        List<ComparatorInterface> list=new ArrayList<>(Arrays.asList(
                new ComparatorInterface("akshay", 22),
                new ComparatorInterface("sahil", 19),
                new ComparatorInterface("pranali", 23),
                new ComparatorInterface("pratham", 20)
        ));

        Collections.sort(list, new Comparator<ComparatorInterface>() {
            @Override
            public int compare(ComparatorInterface o1, ComparatorInterface o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        //Using Lambda Expression

        Collections.sort(list,(p1,p2)->p1.getAge() - p2.getAge());

        //Using method reference
        Comparator<ComparatorInterface> byAge=Comparator.comparing(ComparatorInterface::getAge);
        Collections.sort(list,byAge);
        System.out.println(list);
    }
}

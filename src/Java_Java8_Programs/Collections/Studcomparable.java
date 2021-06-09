package Java_Java8_Programs.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Studcomparable implements Comparable<Studcomparable> {

    int rollno, marks;
    String name;

    public Studcomparable(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "comparableinterface{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Studcomparable s) {
        return marks>s.marks?1:-1;
    }
}
class CollectionDEmo{
    public static void main(String[] args) {
        List<Studcomparable> studs=new ArrayList<>();
        studs.add(new Studcomparable(1,50,"akshay"));
        studs.add(new Studcomparable(2,42,"prem"));
        studs.add(new Studcomparable(3,35,"sakshi"));
        studs.add(new Studcomparable(4,43,"shailja"));

        Collections.sort(studs);   //giving error because you cannot sort this collection because doesn't implement
                                   // comparable interface. whenever you want a class objects to compare we need to
                                   // implement comparable interface.



        for (Studcomparable c: studs){
            System.out.println(c);
        }

    }
}


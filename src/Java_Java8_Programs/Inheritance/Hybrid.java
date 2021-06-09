package Java_Java8_Programs.Inheritance;

public class Hybrid {
    public void College(){
        System.out.println("University has colleges");
    }
}

    class College extends Hybrid{
        public void Teacher(){
            System.out.println("College has teachers");
        }
    }

    class Teacher extends College{
        public void Student(){
            System.out.println("Teacher teaches students");
        }
    }

    class Exams extends Hybrid {
        public void Exam() {
            System.out.println("University conduct exams");
        }

        public static void main(String[] args) {
            Exams e=new Exams();
            Teacher t=new Teacher();
            e.College();
            t.Teacher();
            t.Student();
            e.Exam();


        }
}

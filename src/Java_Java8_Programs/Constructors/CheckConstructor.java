//Default Constructor
//It does not have any parameter.

package Java_Java8_Programs.Constructors;

public class CheckConstructor {

    public CheckConstructor(){
        System.out.println("In constructor");
    }

    void display(){
        System.out.println("In method");
    }

    public static void main(String[] args) {
        CheckConstructor c=new CheckConstructor();
        c.display();

    }
}



/*CONSTRUCTOR
Constructor is special type of method which has same name as that of class and it does not have any return type.
it is called when an object of class is created.
*/
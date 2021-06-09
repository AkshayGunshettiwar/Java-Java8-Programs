package Java_Java8_Programs.Abstraction;

abstract class abstractionEx {
    String color;

    //abstract methods
    abstract float area();
    public abstract String toString();

    //constructor
    public abstractionEx(String color){
        System.out.println("shape constructor called");
        this.color=color;
    }

    //concrete method
    public String getColor(){
        return color;
    }
}

class Circle extends abstractionEx{

    float radius;
    @Override
    float area() {
        return (float) (Math.PI* Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        return "Color of circle is " + super.getColor() + " and area is" + area();
    }

    public Circle(String color, float radius){
        //call shape constructor
        super(color);
        System.out.println("circle constructor called");
        this.radius=radius;
    }
}
class Rectangle extends abstractionEx{

    float height, width;
    @Override
    float area() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Color of circle is " + super.getColor() + " and area is" + area();
    }

    public Rectangle(String color, float height, float width){
        //calling shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.height=height;
        this.width=width;
    }
}
class Test1{
    public static void main(String[] args) {
        abstractionEx abs=new Circle("Red", 2);
        abstractionEx abs1=new Rectangle("Yellow", 6,4);

        System.out.println(abs.toString());
        System.out.println(abs1.toString());

    }
}
package Java_Java8_Programs.Practiceprograms;

//final keyword so it cannot be extended
final class ImmutableClass {

    private String name;//private class members so cannot be accessed outside of class
    private String city;

    ImmutableClass(String name, String city){
        this.name=name;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    //No setters so outer class cannot change class members
}
class Main{
    public static void main(String[] args) {
        ImmutableClass i=new ImmutableClass("Akshay","pune");
        i.getName();
        i.getCity();
    }
}

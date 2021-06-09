package Java_Java8_Programs.Encapsulation;

public class StudentData {

    private Integer id;
    private String name;
    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class CheckStu{
    public static void main(String[] args) {
        StudentData s=new StudentData();
        s.setId(1);
        s.setName("akshay");
        s.setCity("pune");

        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        System.out.println("City:"+ s.getCity());
    }
}

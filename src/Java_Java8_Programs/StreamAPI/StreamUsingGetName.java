package Java_Java8_Programs.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsingGetName {

    public static void main(String[] args) {


    Customer c1=new Customer(1,"A","pune");
    Customer c2=new Customer(2,"B","mumbai");
    Customer c3=new Customer(3,"C","goa");

    List<Customer> custList=new ArrayList();
    custList.add(c1);
    custList.add(c2);
    custList.add(c3);

    //using lambda expression
    List<String> names=custList.stream()              //flow of data
            .map(cust->cust.getName()).collect(Collectors.toList());

    //using method reference

        List<String> city=custList.stream().map(Customer::getCity).collect(Collectors.toList());

    System.out.println("Names:"+names);
    System.out.println("Cities:" +city);

    }

}
  class Customer{
     private Integer id;
     private String name;
     private String city;

     public Customer(Integer id, String name, String city){
         this.id=id;
         this.name=name;
         this.city=city;
     }

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
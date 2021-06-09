package Java_Java8_Programs.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfaceTypes {
    public static void main(String[] args) {

        //FunctionInterface
        Function<String,String> f= Str->(Str.trim());
        String trim=f.apply("  Akshay");
        System.out.println("Trimmed String is:"+trim);

        Function<String,String > fun=str->str.concat("akshay");
        String con=fun.apply("gunshettiwar");
        System.out.println("Concatenated string is:"+con);

        //BiFunctionInterface
        BiFunction<Integer,Integer,List<Integer>> f1=(x, y)-> Arrays.asList(x+y);
        List<Integer> res=f1.apply(20,5);
        System.out.println("Result is:"+res);

        //BinaryOperator
        BinaryOperator<Integer> f2=(a, b)->a/b;
        Integer div=f2.apply(100,50);
        System.out.println("Division is:"+div);

        //UnaryOperator
        UnaryOperator<Integer> Uop1= a->a*2;
        UnaryOperator<Integer> Uop2=a->a*a;
        Integer a=Uop1.andThen(Uop2).apply(5);
        System.out.println("Result is:"+a);
        Integer b=Uop1.compose(Uop2).apply(6);
        System.out.println("Result is:"+b);

        //FunctionChaining
        Function<String,String> f4=Str->Str.substring(3);
        Function<String,String> f5=Str->Str.toUpperCase();
        String Result=f4.andThen(f5).apply("Developer");
        System.out.println("Result is:"+Result);

        //Predicate
        List<String> list= Arrays.asList("Java","Php",".NET","Python");
        Predicate<String> p= x->x.contains("P");
        List<String> newList=list.stream().filter(p).collect(Collectors.toList());
        System.out.println("New List is:"+newList);

        //BiPredicate Interface
        BiPredicate<String,String> Bip=(s1,s2)->(s1.equals(s2));
        boolean flag=Bip.test("Akshay","AKSHAY");
        System.out.println("Flag:"+flag);

        //Consumer Interface
        Consumer<String > c=val->System.out.println(val);
        // c.accept(10);
        c.accept("java");

        //BiConsumer Interface
        BiConsumer<String,Integer> c1=(name,age)->System.out.println(name+" "+age);
        c1.accept("Akshay",21);

        //Supplier Interface
        Supplier<Double> sup=()->Math.random();
        System.out.println(sup.get());
    }
}

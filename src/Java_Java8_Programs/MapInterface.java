package Java_Java8_Programs;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(40,"A");
        map.put(45,"B");
        map.put(30,"C");
        map.put(34,"D");

        System.out.println("Map Data:"+map);

//        Iterator<Integer> i=map.keySet().iterator();
//        while (i.hasNext()){
//            int key=i.next();
//            System.out.println("Marks:"+key+" name:"+map.get(key));
//        }

        //using java8
        map.forEach((Integer,String)->System.out.println("[marks]:" +Integer +" [name]:" +String ));

//        for(Map.Entry e:map.entrySet()){
//
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
    }
}

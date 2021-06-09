package Java_Java8_Programs.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Object> map=new HashMap<>();
        map.put("name","akshay");
        map.put("age",20);
        map.put("city", "pune");
        map.put("city", "mumbai");       //it does not take duplicate values will override with the existing value

        Set<String> keys=map.keySet();

        for (String key:keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}

//It follows the hashing algorithm. so, it will give output in random format

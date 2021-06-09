package Java_Java8_Programs.Practiceprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

        List<Integer> keyList=new ArrayList<>(map.keySet());
        List<String> valueSet=new ArrayList<>(map.values());

        System.out.println("key list:"+keyList);
        System.out.println("Value list:"+valueSet);
    }
}

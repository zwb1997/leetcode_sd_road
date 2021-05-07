package hasmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        Map<Map<String,Object>, String> map2 = new LinkedHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(1, "3");
        Map<String,Object> theMap = new HashMap<>();
        theMap.put("1the", 1);
        map2.put(theMap, "1");
        Object obj = map2.get(theMap);
        System.out.println(obj);
    }


    public void test1(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("1", 1);
    }
}

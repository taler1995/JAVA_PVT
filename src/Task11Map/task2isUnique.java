package Task11Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class task2isUnique {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Kendrick", "Perkins");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Bruce", "Reges");
        map.put("Hal", "Perkins");
        System.out.println(map);
        for (Iterator itr = map.entrySet().iterator(); itr.hasNext(); ) {
            Map.Entry<String, String> entrySet = (Map.Entry) itr.next();

            String value = entrySet.getValue();
            System.out.println(value);
        }
    }
}


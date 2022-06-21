package collection_framework.luyen_tap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Thiện", 26);
        hashMap.put("Tài", 25);
        hashMap.put("Thịnh", 23);
        hashMap.put("Phú", 25);
        System.out.println("Danh sác trong Hashmap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị theo thứ tự tăng dần theo tên");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Thiện", 26);
        linkedHashMap.put("Tài", 25);
        linkedHashMap.put("Thịnh", 23);
        linkedHashMap.put("Phú", 25);
        System.out.println("\n Tuổi của " + "Tài là: " + linkedHashMap.get("Tài"));
    }
}

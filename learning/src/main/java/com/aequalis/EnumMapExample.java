package com.aequalis;
import java.util.*;
import java.util.Map.Entry;

public class EnumMapExample {
    public enum Days {
        monday, tuesday, wednesday, thursday, friday
    };

    public static void main(String[] args) {
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.monday, "1");
        map.put(Days.tuesday, "2");
        map.put(Days.wednesday, "3");
        map.put(Days.thursday, "4");
        for (Map.Entry m : map.entrySet()) {
        System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
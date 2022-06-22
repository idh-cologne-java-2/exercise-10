package idh.java;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution{

public static void main(String[] args) {
 //   System.out.println(getTimeMsOfInsert(new ArrayList()));
    System.out.println(getTimeMsOfInsert(new List()));
}

public static long getTimeMsOfInsert(List list) {
    return getInsertTime(list);
}

public static long getInsertTime(List list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
        list.add(null, 10);
    }
    return System.currentTimeMillis() - start;
}
}
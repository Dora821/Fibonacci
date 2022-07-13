package com.galvanize;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main (String[] args) {


        System.out.println(fibbSeq(4));
    }

    static Map<Integer, Integer> cache = new HashMap<>();
    public static int fibbSeq(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int res = fibbSeq(n-1) + fibbSeq(n-2);
        cache.put(n, res);
        return res;
    }

}

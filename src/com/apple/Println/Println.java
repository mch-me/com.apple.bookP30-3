package com.apple.Println;

public class Println {
    public static void main(String[] args) {
        int res, n1 = 12, n2 = 24, n3 = 16, n4 = 3;
        double d, v1 = 10.0, v2 = 3.1416;
        res = n1 / n4;
        System.out.println("res = n1 / n4,res = "+ res);
        d = n1 / n4;
        System.out.println("d = n1 / n4,d = "+ d);
        res = n3 / n4;
        System.out.println("res = n3 / n4,res = "+ res);
        d = n3 / n4;
        System.out.println("d = n3 / n4,d = "+ d);
        d = v1 / n4;
        System.out.println("d = v1 / n4,d = "+ d);
        d = v1 / v2;
        System.out.println("d = v1 / v2,d = "+ d);
        res = n1 / n2;
        System.out.println("res = n1 / n2,rse = "+ res);
        d = (double)n1 / n2;
        System.out.println("d = (double)n1 / n2,d = "+ d);
        d = n1 / (double)n2;
        System.out.println("d = n1 / (double)n2,d = "+ d);
        d = (double)(n1 / n2);
        System.out.println("d = (double)(n1 / n2),d = "+ d);
    }
}

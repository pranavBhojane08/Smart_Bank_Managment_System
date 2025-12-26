package com.bank.main;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    public static double getDouble(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    public static String getString(String msg) {
        System.out.print(msg);
        return sc.next();
    }
}

package com.lizhou.tools;

public class Ulog {
    public static void i(String tag, String content) {
        System.out.println(tag + "---" + content + "");
    }

    public static void i(String content) {
        System.out.println("---" + content + "");
    }
}

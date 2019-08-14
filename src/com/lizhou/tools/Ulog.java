package com.lizhou.tools;

public class Ulog {

    public static void i(String tag, Object content) {
        System.out.println(tag + "---" + content + "");
    }

    public static void i(Object content) {
        System.out.println("---" + content + "");
    }


}

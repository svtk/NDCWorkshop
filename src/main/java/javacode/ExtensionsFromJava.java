package javacode;

import static examples._3Extensions.ExtensionsKt.lastChar;

public class ExtensionsFromJava {
    public static void main(String[] args) {
        char ch = lastChar("abc");
        System.out.println(ch);

//        char ch = StringUtil.lastChar("abc");
    }
}

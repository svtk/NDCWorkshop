package javacode;

import examples._6Objects.KSingleton;

public class UsingKotlinObjectFromJava {
    public static void main(String[] args) {
        JSingleton.INSTANCE.foo();
        KSingleton.INSTANCE.foo();
    }
}

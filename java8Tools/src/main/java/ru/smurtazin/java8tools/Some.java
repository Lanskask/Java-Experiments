package ru.smurtazin.java8tools;

/**
 * Created by a1 on 31.03.17.
 */
@FunctionalInterface
public interface Some {
    int field1 = 1;
    int field2 = 2;

    void printSome();

    default void sum() {
        System.out.println("text");
    }

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void print(String str){
        System.out.println("Printing "+str);
    }

}

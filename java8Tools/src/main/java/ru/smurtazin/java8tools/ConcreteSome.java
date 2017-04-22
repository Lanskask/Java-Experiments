package ru.smurtazin.java8tools;

/**
 * Created by a1 on 31.03.17.
 */
public class ConcreteSome implements Some {

    @Override
    public void printSome() {
        System.out.println("in print some");
    }

    public static void main(String[] args) {
        ConcreteSome concreteSome = new ConcreteSome();

        concreteSome.printSome();
        concreteSome.log("my string 1");
//        concreteSome.some();
    }
}

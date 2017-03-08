package ru.smurtazin.experiments.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 * Created by a1 on 08.03.17.
 */
public class PartialReading {

    public void workWithFile() throws IOException {
        FileInputStream in = null;
//        Reader in = null;
        FileOutputStream out = null;

        int maxMemoSize = 30;

        try {
            in = new FileInputStream("input.txt");
//            in = new Reader("input.txt");
            out = new FileOutputStream("output.txt");

            int allSize = in.available();
            byte[] data = new byte[allSize+ maxMemoSize];

            System.out.println("allSize: " + allSize);
            System.out.printf("allSize / maxMemoSize + 1: %d \n", allSize / maxMemoSize + 1);

            for (int i = 0; i < allSize / maxMemoSize + 1; i++) {
                in.read( data, maxMemoSize*i, maxMemoSize);
                System.out.println(i + ": " + new String(data, "UTF-8"));
            }
            out.write(data);

            String str1 = new String(data);
            System.out.println("str1 len: " + str1.length());

            String str2 = "Lorem ipsum dolor sit amet, consectetur " +
                    "adipisicing elit. Maxime rem at repudiandae illum, " +
                    "sint asperiores aut iusto, ratione molestiae assumenda, " +
                    "autem? Laboriosam dicta reiciendis, saepe obcaecati " +
                    "itaque libero, iure vel.";
            System.out.println("str2 len: " + str2.length());

            String str3 = "Lorem ipsum dolor sit amet, co" +
                    "xime rem at repudiandae illum," +
                    "em? Laboriosam dicta reiciendi";
            System.out.println("str3 len: " + str3.length());

            System.out.println(str1.contentEquals(str2));

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public void printPwd() {
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
    }

    public static void main(String[] args) throws IOException {
        PartialReading partialReading = new PartialReading();
        partialReading.workWithFile();
    }
}

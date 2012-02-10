package com.trainings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Tigra
 * Date: 09.02.12
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */
public class UniqueNames {


    public static void main(String[] args) throws Exception {
        HashSet<String> names = new HashSet<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.print("Enter name: ");
                String line = bufferedReader.readLine();
                if (line.equals("")) {
                    break;
                }
                names.add(line);
            }
            System.out.println("Unique name list contains: ");
            for (Object o : names)
            System.out.println(o);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
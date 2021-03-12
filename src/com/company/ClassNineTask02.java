package com.company;

import java.io.*;
import java.util.Scanner;

public class ClassNineTask02 {
    private static Object Finally;
    //2) Попросить пользователя ввести строку и имя файла. Записать строку в файл

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to string");
        String str = scanner.nextLine();
        System.out.println("Enter file name");
        System.out.println("String: " + str);
        String fileName = scanner.nextLine();
        System.out.println("File name: " + fileName);

        writeToStringInFile(str, fileName);

    }

    private static void writeToStringInFile(String str, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
   /* private static void writeToStringInFile(String str, String fileName) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }



}
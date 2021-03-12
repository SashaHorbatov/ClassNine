package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
   /* private static Map<String, Integer> ticketTypeToPrice = new HashMap<String, Integer>();
    private static final String SPACE = " ";
    private static final String CURRENCY_SYMBOL = " $";

    public static void getInputFileName() {
        System.out.println("Enter filename here : ");

        String sWhatever;

        Scanner scanIn = new Scanner(System.in);
        sWhatever = scanIn.nextLine();

        scanIn.close();
        System.out.println(sWhatever);
    }

    public static void main(String[] args) {
        Scanner scanner = null;
        PrintWriter outputFile = null;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(2);
        try {
            File file = new File("portlandvip2.txt");
            scanner = new Scanner(file);
            outputFile = new PrintWriter("portland2out.txt");
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] entriesOnLine = line.split(" ");
                // Line with price and ticket type
                if (entriesOnLine.length == 2) {
                    ticketTypeToPrice.put(entriesOnLine[0], Integer.parseInt(entriesOnLine[1]));
                    StringBuilder sb = new StringBuilder();
                    sb.append(entriesOnLine[0])
                            .append(CURRENCY_SYMBOL)
                            .append(decimalFormat.format(Integer.parseInt(entriesOnLine[1])));
                    outputFile.println(sb.toString());
                } else if (entriesOnLine.length == 4) {
                    //Line with First Name, Last Name, number of Tickets and Price
                    int numberOfTickest = Integer.parseInt(entriesOnLine[2]);
                    int ticketPrice = ticketTypeToPrice.get(entriesOnLine[3]);
                    int totalPrice = numberOfTickest * ticketPrice;
                    StringBuilder sb = new StringBuilder();
                    sb.append(entriesOnLine[0])
                            .append(SPACE)
                            .append(entriesOnLine[1])
                            .append(CURRENCY_SYMBOL)
                            .append(decimalFormat.format(totalPrice));
                    outputFile.println(sb.toString());
                }
            }
        } catch (IOException e) {
            System.out.println("exception:" + e);
        } finally {
            scanner.close();
            outputFile.close();
        }
    }

*/




}

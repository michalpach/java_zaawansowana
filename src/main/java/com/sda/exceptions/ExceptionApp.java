package com.sda.exceptions;

import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {

        String text = "zenon";
        try {
            System.out.println(text.substring(8));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Wyraz za krótki");
        }

        String text2 = null;
        try {
            int number = text2.length();
            System.out.println(number);
        } catch (NullPointerException e) {
            System.out.println("Tekst nie istnieje");
        } finally {
            System.out.println("Nara");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Ktoś ty?");
        String name = scan.nextLine();


        greet(name);

    }


        public static void greet (String who) throws InvalidNameException{
            if(who==null|| who.isBlank()) {
                throw new InvalidNameException(who);
            }
            System.out.println("Hello "+ who);
        }


}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enjoy youthful life on MTN pulse");

        System.out.println("1. Migrate to MTN pulse");
        System.out.println("2. 1GB @ N500 (Pulse Only)");
        System.out.println("MTN Music + @ N10");
        System.out.println("NightLife Bundles");
        System.out.println("Goody bag Bundles");

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an option");
        int a = in.nextInt();

        if (a == 1) {
            System.out.println("Congrats you have successfully migrated to MTN pulse");
        } else if (a == 2) {
            System.out.println("1. Proceed");
            System.out.println("2. Opt- Out");

            int b = in.nextInt();

            if (b == 1) {
                System.out.println("You have successfully subscribed to 1GB @ N500");
            } else if (b == 2) {
                System.out.println("You have opted out of this plan");
            } else {
                System.out.println("Invalid USSD code");
            }
        }else if (a == 3){
            System.out.println("You have successfully subscribed to MTN Music @ N10");
        }else if (a == 4){
            System.out.println("You have successfully subscribed to MTN life bundle");
        }else if (a == 5){
            System.out.println("WhatsApp");
            System.out.println("Facebook");
            System.out.println("Twitter");
            System.out.println("Instagram");
            System.out.println("2go");

            int c = in.nextInt();
            if (c == 1){
                System.out.println("Whatsapp Daily @ N25");
                System.out.println("Whatsapp weekly @ N50");
                System.out.println("Whatsapp monthly @ N150");

                int d = in.nextInt();
                if(d == 1){
                    System.out.println("Activate");
                    System.out.println("Cancel Auto Renew");
                    System.out.println("Check Balance");
                }
                else if (d==2){
                    System.out.println("Activate");
                    System.out.println("Cancel Auto Renew");
                    System.out.println("Check Balance");
                }
                else if (d==3){
                    System.out.println("Activate");
                    System.out.println("Cancel Auto Renew");
                    System.out.println("Check Balance");
                }
                else{
                    System.out.println("Invalid USSD code!");
                }
            }
        }
        else{
            System.out.println("Invalid USSD code!");
        }
    }
}

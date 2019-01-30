package com.company;
import java.util.Scanner;

public class Employname {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner (System.in);
        System.out.println("Customer Name");
                String customname = Keyboard.nextLine();

        System.out.println("Purchase amount");
                int purchaseamount =Keyboard.nextInt();
        System.out.println("Tax code 0 1 2 3");
        int taxcode = Keyboard.nextInt();

        double taxExempt = 0;
        if (taxcode  == 0){
             taxExempt = 0;
        }
        else if (taxcode == 1 ){
          taxExempt = 0.3;
        }
        else if (taxcode == 2) {
            taxExempt = 0.5;
        }
        else if (taxcode == 3) {
            taxExempt = 0.7;
        }
            double salestax= (taxExempt/100 )* (purchaseamount);
            double total_amount_due = salestax + purchaseamount;

            System.out.println(customname +  " \n" + taxExempt +  " \n" + purchaseamount +  " \n" + salestax +  " \n" +
                    total_amount_due);


        }



	// write your code here
    }


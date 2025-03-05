
package com.mycompany.mavenproject19;
import java.util.Scanner;

//Class Definition
public class BankAccount {
    
    Scanner input = new Scanner(System.in);
    
//    Attributes
   private String accountHolder;
   private double balance;
   static private int totAccounts;
   
//   Methods
//   Constructors
   BankAccount(String accountHolder, double balance){
       totAccounts++;
       this.accountHolder = accountHolder;
       System.out.println("Account Holder: " + accountHolder);
       this.balance = balance;
       System.out.println("Balance: " + balance);
   }
   
   static public void totAccounts(){
       System.out.println("Total Accounts:" + totAccounts);
   }
   
}

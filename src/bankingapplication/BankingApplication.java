/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

/**
 *
 * @author LENOVO
 */import java.util.Scanner;

public class BankingApplication {
     private static double balance = 0;
     private static Scanner scanner = new Scanner(System.in);
   
    
    public static void main(String[] args) {
        boolean Running = true;
        
        while (Running) {
            System.out.println("Welcome to Banking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
             int choice = scanner.nextInt();
             
             switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                   Balance();
                    break;
                case 4:
                    Running = false;
                    System.out.println("Thank you for using the Banking Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
    }
        }
         scanner.close();
    }
     private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }
      private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.Try again ");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Your new balance is: " + balance);
    }
       private static void Balance() {
        System.out.println("Your current balance is: " + balance);
    }
        
        
    }
    



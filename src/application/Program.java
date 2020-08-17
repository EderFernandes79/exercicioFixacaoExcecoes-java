
/*
Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta.

*/


package application;

import java.text.ParseException;
import java.util.*;
import model.entities.Account;
import model.exceptions.Domain_Execption;

public class Program {
    
     public static void main(String[] args) throws ParseException {
         
         Locale.setDefault(Locale.US);  //ponto no lugar de virgula
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("Enter account data");
         System.out.print("Number: ");
         int number = sc.nextInt();
         
         System.out.print("Holder: ");
         sc.nextLine();
         String h = sc.nextLine();
         
         System.out.print("Initial Balance : ");
         double ib = sc.nextDouble();
         
         System.out.print("Withdraw Limit: ");
         double wl = sc.nextDouble();
         
         Account acc = new Account(number, h, ib, wl);
         
         System.out.println();
         
         System.out.print("Enter amount for withdraw: ");
         double amount = sc.nextDouble();
         
         
         //tratando a exceção
         try {
             
             acc.withdraw( amount );
             
             System.out.println("New balance: " + String.format("%.2f", acc.getBalance()) );
         }
         catch ( Domain_Execption e ) {
             System.out.println("Withdraw error: " + e.getMessage());
             
         }
         System.out.println("\n\n");
         sc.close();
    }//fim main
    
}//fim class

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentMeansController;
import Model.Cash;
import Model.CurrencyTypes;
import Model.PaymentMean;
import Model.PaymentTypes;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ruben Ferreira
 */
public class PaymentMeansUI {
    
     PaymentMeansController pmc = new PaymentMeansController();
     CurrencyTypes ct = new CurrencyTypes();
     
     private static List<PaymentMean> listPayMeansAUX = new ArrayList<>();
   
     public PaymentMeansUI() {
      
     }
    
      public void run() {      
          PaymentMeanUIMain();        
      }

            public void PaymentMeanUIMain() 
            {
            int op;
            do {
                  op = menu();
                  switch (op) {
                        case 0:
                              break;
                        case 1: 
                              System.out.println("You chose to add Cash:");
                              String currency = ct.getCurrencyList();
                              PaymentMean aux;
                              listPayMeansAUX = pmc.getListPaymentMeans();
                              for(int i=0; i < listPayMeansAUX.size();i++){
                                  aux = listPayMeansAUX.get(i);
                                  if (aux instanceof Cash){
                                      System.out.println("Cash already exists!");
                                      break;  
                                  }
                              }                            
                              pmc.registerCash(currency);
                              System.out.println("Payment mean added to the repository.");
                              break;
                        case 2:
                              System.out.println("You chose to add a Check:");
                              
                              String instBanc = Console.readLine("Bank:");
                              int num = Console.readInteger("Check Number:");
                              
                              pmc.registerCheck(num, instBanc);
                              System.out.println("Payment mean added to the repository.");
                              break;
                        case 3:
                              System.out.println("You chose to add a Debit Card:");
                              
                              String instB = Console.readLine("Bank:");
                              String tipo = Console.readLine("Type:");
                              int num1 = Console.readInteger("Card Number:");
                              
                              pmc.registerDCard(num1,instB,tipo);
                              System.out.println("Payment mean added to the repository.");
                              break;
                        case 4:
                              System.out.println("You chose to add a Credit Card:");
                              
                              String instBa = Console.readLine("Bank:");
                              String tipo1 = Console.readLine("Type:");
                              int num2 = Console.readInteger("Card Number:");
                              Date d1 = Console.readDate("Expiration Date: ");
                              
                              pmc.registerCCard(d1,num2,instBa,tipo1);
                              System.out.println("Payment mean added to the repository.");
                              break;
                        default:
                            break;
                  }
            } while (op != 0);
           }
            
            
           private  int menu() 
           {
               
            System.out.println("* * *  REGISTER A PAYMENT MEAN  * * *");
            System.out.println("* * *  LIST OF PAYMENT MEANS  * * *\n");
            pmc.getPaymentMeansList(); //lista todos os meios guardados no repositório
            
            System.out.println("* * *  WHAT TYPE OF MEAN DO YOU WISH TO ADD?  * * *");
            System.out.println("===================\n"); //para efeito de teste está implementado assim
            PaymentTypes pmt = new PaymentTypes();
            pmt.getList();
            System.out.println("0. Exit\n\n");

            int option = Console.readInteger("Please choose an option");
            return option;
        }
            

            
 }
    

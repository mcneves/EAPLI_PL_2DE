/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;
/**
 *
 * @author mcn
 */
public class MainMenu {

      public MainMenu() {
      }
       public void mainLoop() {
            int op;
            do {
                  op = menu();
                  switch (op) {
                        case 0:
                              System.out.println("bye bye ...");
                              break;
                        case 1:
                              ExpenseRegisterUI ui = new ExpenseRegisterUI();
                              ui.run();
                              break;
                      case 2:
                              ShowExpensesUI showExpensesUI = new ShowExpensesUI();
                              showExpensesUI.loop();
                              break;
      
                      case 3:
                              PaymentMeansUI pmUI = new PaymentMeansUI();
                              pmUI.show();
                              break;

                      case 4:
                          ShowTotalExpensesUI showTotalExpensesUI = new ShowTotalExpensesUI();
                          showTotalExpensesUI.run();
                          break;
                          
                      case 5:
                          ExpenseTypeRegisterUI expenseTypeRegisterUI = new ExpenseTypeRegisterUI();
                          expenseTypeRegisterUI.run();
                          break;
                      case 6:
                          ShowTotalExpensesByTypeUI expensesPerMonth = new ShowTotalExpensesByTypeUI();
                          expensesPerMonth.run();
                          break;
                      case 7:
                          IncomeTypeRegisterUI incomeTypeRegisterUI = new IncomeTypeRegisterUI();
                          incomeTypeRegisterUI.run();
                          break;                         
                      case 8:
                          IncomeRegisterUI incomeUI = new IncomeRegisterUI();
                          incomeUI.run();
                          break;

                  }
            } while (op != 0);

      }
             private  int menu() {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");
            System.out.println("1. Register an expense");
            System.out.println("2. Show expenses");
            System.out.println("3. Register a payment mean");
            System.out.println("4. Show Total Expenses by month");
            System.out.println("5. Register an expense type");
            System.out.println("6. Show Total Expenses by type per month");
            System.out.println("7. Register an Income Type");
            System.out.println("8. Register an Income");
            System.out.println("0. Exit\n\n");

            int option = Console.readInteger("Please choose an option");
            return option;
      }
}


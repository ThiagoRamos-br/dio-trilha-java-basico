package src.entities.application;

import java.util.Scanner;

import src.ServiceBanco.ServiceConta;
import src.entities.ContaBanco;
import src.entities.ExceptionConta.ErrorContaException;

public class ContaTerminal {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter your details to create your bank account.");

    System.out.println("name:");
    String nameCount = sc.nextLine();

    System.out.println("agency:");
    String agencyCount = sc.nextLine();

    System.out.println("number:");
    int numberCount = sc.nextInt();

    System.out.println("balance:");
    Double balanceCount = sc.nextDouble();


try {
    ServiceConta cb = new ServiceConta(nameCount, agencyCount, numberCount, balanceCount);
    cb.accountConfirmationMessage();
} catch (ErrorContaException e) {
  
    System.err.println("Erro ao criar conta: " + e.getMessage());
} finally {
    sc.close();
}
 }
}

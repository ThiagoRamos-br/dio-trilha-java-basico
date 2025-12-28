package src.ServiceBanco;

import src.entities.ContaBanco;
import src.entities.ExceptionConta.ErrorContaException;

public class ServiceConta extends ContaBanco{

    public ServiceConta(String nameClient, String agency, Integer number, Double balance) throws ErrorContaException {
        super(nameClient, agency, number, balance);
        //TODO Auto-generated constructor stub
    }

public void accountConfirmationMessage() {
    System.out.println("Olá " + this.getNameClient() + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.getAgency() + ", conta " + this.getNumber() + " e seu saldo " + this.getBalance() + " já está disponível para saque.");
}
}

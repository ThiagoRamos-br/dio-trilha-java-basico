package src.entities;

import src.entities.ExceptionConta.ErrorContaException;

public class ContaBanco {
    // numero
    //agencia
    //nome
    //cliente
    //saldo
    private String nameClient;
    private String agency;
    private Integer number;
    private Double balance;
    
    public ContaBanco(String nameClient, String agency, Integer number, Double balance) throws ErrorContaException {
    if (balance <= 0) {
            throw new ErrorContaException("Error adding account balance, negative numbers are not accepted.");
    }
        this.nameClient = nameClient;
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameClient == null) ? 0 : nameClient.hashCode());
        result = prime * result + ((agency == null) ? 0 : agency.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContaBanco other = (ContaBanco) obj;
        if (nameClient == null) {
            if (other.nameClient != null)
                return false;
        } else if (!nameClient.equals(other.nameClient))
            return false;
        if (agency == null) {
            if (other.agency != null)
                return false;
        } else if (!agency.equals(other.agency))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        return true;
    }

    

    

}
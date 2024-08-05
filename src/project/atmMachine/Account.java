package project.atmMachine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
    }

    public void calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
    }

    public void calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
    }

    public void calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account balance : "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking amount : ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0 ){
            calcCheckingWithdraw(amount);
            System.out.println("New checking account balance : "+moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot be negative."+"\n");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving account balance : "+moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving account");
        double amount = input.nextDouble();

        if((savingBalance - amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New saving account balance : "+moneyFormat.format(savingBalance));
        }
        else {
            System.out.println("Balance cannot be negative."+"\n");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking Account balance : "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit from Checking amount : ");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0 ){
            calcCheckingDeposit(amount);
            System.out.println("New checking account balance : "+moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot be negative."+"\n");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving account balance : "+moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving account");
        double amount = input.nextDouble();

        if((savingBalance + amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("New saving account balance : "+moneyFormat.format(savingBalance));
        }
        else {
            System.out.println("Balance cannot be negative."+"\n");
        }
    }
}

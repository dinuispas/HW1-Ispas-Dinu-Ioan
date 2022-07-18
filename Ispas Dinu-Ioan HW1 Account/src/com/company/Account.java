package com.company;

public class Account{

    private int accountNo;
    private int amount;
    private int nationalId;

    public Account() {

    }

    public void deposit(int amount){
        System.out.println("Your amount: " + amount);
    }

    private int deposit;
    public void withdraw(int amount, int deposit) throws notEnoughMoneyException {

        if(amount - deposit < 0){

            throw new notEnoughMoneyException("Not enough money in the bank account");

        }else{
            System.out.println("The following sum has been withdrawn: " + deposit + " out of " + amount);
            System.out.println("Balance left: " + (amount - deposit));
        }
    }

    public void linkToNationalId(int nationalId) throws invalidNationalIdException {
        String str = Integer.toString(nationalId);
        int size = str.length();
        if(size < 10){
            throw new invalidNationalIdException("The ID does not fit");
        }else {
            System.out.println("ID checked");
        }
    }


}

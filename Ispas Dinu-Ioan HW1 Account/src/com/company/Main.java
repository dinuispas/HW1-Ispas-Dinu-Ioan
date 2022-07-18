package com.company;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(150);

        try{
            account.withdraw(150,149);
        } catch (notEnoughMoneyException e) {
            e.printStackTrace();
        }

        try{
            account.linkToNationalId(1234567890);
        } catch (invalidNationalIdException e) {
            e.printStackTrace();
        }


    }


}

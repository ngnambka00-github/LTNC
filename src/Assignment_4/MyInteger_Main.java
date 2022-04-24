package Assignment_4;

import javax.swing.*;

public class MyInteger_Main {
    public static void main(String[] args) {
        MyInteger numClass = new MyInteger(10);
        System.out.println("Value: " + numClass.getValue());
        System.out.println("Is Even: " + numClass.isEven());
        System.out.println("Is Odd (Static): " + MyInteger.isOdd(10));
        System.out.println("Is Prime (Static): " + MyInteger.isPrime(10));
        System.out.println("Check equal: " + numClass.equals(20));
        System.out.println("Check parse int1: " + String.valueOf(MyInteger.parseInt("123")));

        char[] numChar = {'1', '2', '3'};
        System.out.println("Check parse int2: " + String.valueOf(MyInteger.parseInt(numChar)));
    }
}

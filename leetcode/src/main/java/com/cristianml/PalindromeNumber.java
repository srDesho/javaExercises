package com.cristianml;

public class PalindromeNumber {

    public static void main(String[] args) {
                int aux = 0;
                int x = 1231;
                int xCopy = x;
                int invertNumber = 0;

                while(x > 0) {
                    aux = x % 10;
                    invertNumber = invertNumber * 10 + aux;
                    x = x / 10;
                }

                if (invertNumber == xCopy) {
                    System.out.println("Is palindrome");

                } else {
                    System.out.println("Is not palindrome");
                }


    }

}

package com.cristianml;

public class RomanToInteger {

    public static void main(String[] args) {
        int result = 0;
        int aux1 = 0;
        int aux2 = 0;
        String s = "MCMLXXX";

        for (int i = 0; s.length() > i; i++) {
            //System.out.println(s.length());
            aux1 = convertToNumber(String.valueOf(s.charAt(i)));

            if (s.length() -1 > i) {
                aux2 = convertToNumber(String.valueOf(s.charAt(i+1)));

            }


            if (aux1 >= aux2){
                result = result + aux1;
            } else if (aux1 <= aux2){
                result =  result + (aux2 - aux1);
                i++;
            }
        }

        System.out.println("result: " + result);
    }


    public static int convertToNumber(String n) {
        int x = 0;
        switch(n) {
            case "I": x = 1;
                break;
            case "V": x = 5;
                break;
            case "X": x = 10;
                break;
            case "L": x = 50;
                break;
            case "C": x = 100;
                break;
            case "D": x = 500;
                break;
            case "M": x = 1000;
                break;

            default: x = 0;
        }

        return x;
    }
}



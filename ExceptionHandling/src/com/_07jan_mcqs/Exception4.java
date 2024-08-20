package com._07jan_mcqs;

public class Exception4 {
    public static void main(String[] args) throws Exception {
        int num = 10;
      
        if (num > 15) {
            throw new Exception("Invalid number.");
        }
        System.out.println("Number is greater than 15");
    }
}
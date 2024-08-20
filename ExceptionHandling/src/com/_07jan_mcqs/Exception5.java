package com._07jan_mcqs;

public class Exception5 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 15;
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("Cannot enter "+e.getMessage());
            e.printStackTrace();
        }
//        finally {
//            System.out.println("Finally block executed.");
//        }
    }
}

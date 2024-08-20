package com.mcqs;

class Basee{
    static  int value = 0;
      Basee(){
      addValue();
      }
  static void addValue(){
      value += 10;
      }
     int getValue(){
       return value;
     }
   }
  class Derivedd extends Basee{
    Derivedd(){
     addValue();
    }
  static void addValue(){
   value +=  20;
    }
  }
  public class Test3 {
    public static void main(String[] args){
        Basee b = new Derivedd();
        System.out.println(b.getValue());
    }
  }
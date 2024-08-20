package com.Enum;

import java.lang.*;

//enum showing Mobile prices
enum Mobile {
Samsung(400), Nokia(250);

int price;
Mobile(int p) {
   price = p;
}
int showPrice() {
   return price;
} 
}

public class Test5 {

public static void main(String args[]) {

  

   System.out.println("CellPhone List:");
   for(Mobile m : Mobile.values()) {
      System.out.println(m + " costs " + m.showPrice() + " dollars");
   }                    
}
}
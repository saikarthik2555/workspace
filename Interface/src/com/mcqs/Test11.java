package com.mcqs;

public class Test11
{
 public static void main(String[] args)
{
    Bq b = new Cq();
    Aq a = b;
    if (a instanceof Aq) System.out.println("A");
    if (a instanceof Bq) System.out.println("B");   
    if (a instanceof Cq) System.out.println("C");
    if (a instanceof Dq) System.out.println("D");
  }
}

class Aq {}
class Bq extends Aq {}
class Cq extends Bq {}
class Dq extends Cq {}
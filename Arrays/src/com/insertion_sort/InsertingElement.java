package com.insertion_sort;

//Inserting an element with an existing  Array elements 
import java.util.Scanner;
//In C it is possible to add element to the arr not created/array size extented
//like   a[i+1]=a[i]  --> here we are adding element to array with size fixed
//but in Java it is not possible to add element
//So we need to create an Extra Array to insert another element
public class InsertingElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n=sc.nextInt();
		int i,ele,pos;
		int a[]=new int[n];
		for(i=0;i<n;i++) {
		System.out.println("Enter elements for "+i+" Cell");
		a[i]=sc.nextInt();
		}
		System.out.println("Your Array Elements : ");
		for(i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println("Enter Element and position to insert : ");
		ele=sc.nextInt(); 
		pos=sc.nextInt();
		int j=0;
		
		int newArr[]=new int[a.length+1];	//new Array
		for(i=0;i<newArr.length;i++) {
			if(i==pos-1) {
				newArr[i]=ele;
			
			}
			else {
				newArr[i]=a[j++];
			}
		}		
//		for(i=n-1;i>=pos-1;i--) {
//			a[i+1]=a[i];
//		}
//		a[i+1]=ele;
// The above condition works in C 		

		for(i=0;i<newArr.length;i++) {
			System.out.print(" "+newArr[i]);
		}
	  }
	}

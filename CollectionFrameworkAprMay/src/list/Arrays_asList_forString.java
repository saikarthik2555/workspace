package list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arrays_asList_forString {
	public static void main(String[] args) {
	List<String> lst=Arrays.asList("wednesday","sunday","monday","tuesday","friday","thursday");
	Comparator<String> com=new Comparator<>() {

		@Override
		public int compare(String str1, String str2) {
			
			return str1.compareTo(str2);	//lexico-graphically
		}	
	};
	lst.sort(com);
	// lst.sort((str1,str2)-> str1.compareTo(str2));		lamda
	lst.forEach(str-> System.out.println(str) );
	char c=78;								//comparing letter to letter asci code
	System.out.println(c);					//ex: above days
	for(char i=97;i<=122;++i) {				//	wed,sun	--> w- 120 s-116
		 System.out.print(i+"    ");		//	mon,tues--> m- 109, t-116--> tu-117	//2nd layer
		}									//  fri,thurs--> f-102,t-116-->  th-104	//2nd layer
	System.out.println();					//
	for(int i=97;i<=122;++i) {				//	102
		System.out.print(i+"  ");			//	109
	}										//	116
	}										//	104	//2nd layer
}											//	117	//2nd layer
											//  120
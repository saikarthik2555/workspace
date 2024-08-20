package character;

public class Literal {
	public static void main(String[] args) {
		char a='A';
		char b=98;		//character
		int c='c';		//unicode
		System.out.println(c);
		System.out.println(a+b);
		System.out.println(a+" "+b);

		int x = 'A'; 
	    int y = 'B';
	    System.out.println(x+y); //131
		System.out.println('A' + 'A'); 		//130
		char ch='\n';
		System.out.println(ch);
		System.out.println("j");
		
		System.out.println("Min and Max");
		System.out.println(Character.MIN_VALUE);		//space
		System.out.println(Character.MAX_VALUE);		//?
		
		for(int i=0;i<255;++i) {
			System.out.println(i+" = "+(char)i);
			if(i%5==0) System.out.println("\n");
		}
		
	}

}

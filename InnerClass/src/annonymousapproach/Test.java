package annonymousapproach;

public class Test {
	public static void main(String[] args) {
//	Parent p=new Child();			no need o child or sub class 
//	p.showData();
		
		Parent p=new Parent() {
			@Override
			public void showData() {
			System.out.println("each class speciying its own behaviour");	
			}
		};
		p.showData(); 
	}

}

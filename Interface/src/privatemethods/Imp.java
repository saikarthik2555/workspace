package privatemethods;

public class Imp implements Inter1,Inter2{
	@Override
	public void method() {
		//abstract method
	}
	
	public static void main(String[] args) {
		Inter1.accsible();		//accessing static method without Obj
		Inter1 i=new Imp();
		i.about(); //default  //we can access only default that to with obj. Obj needed for default
		//i.accsible();			//we cannot access public static thouhgh obj , private static ,private non-static
		//i.CannotAssible();   // in implementer class
		//i.check();
		
	}

}

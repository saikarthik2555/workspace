package variable_final;

public class SubClass extends FinalVariable {
	public static void main(String[] args) {
		//can access but cannot re-assign
		new SubClass().printData();
	}
	public void printData() {
		System.out.println(rollno+" "+name);
	}
	public void setData() {
	//	name="not Possible";
	}
}

package practise_july;

public record Sample(Integer id,String name) {
	static Integer ies;
	
	static{
		
	}
	
	public Sample{
		Integer id1=id;
		String name1=name;		
	}
	
	public void get() {
		if(id<0) System.out.println("id is less");
	}
	
	public static void show() {
		
	}

}

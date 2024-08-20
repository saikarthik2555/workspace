package practise;

public class EnumObjects {
	public static void main(String[] args) {
	Direction d[]=Direction.values();
	for(Direction e:d) {
		System.out.println(e);
	}
	
	
	}
}
enum Direction{
	NORTH,SOUTH,WEST, EAST();
	public static void main(String[] args) {
		
	}
	
	{
		System.out.println("Instance executed : Direction");
	}
	Direction(){
		System.out.println("Super executed: Direction");
	}
	
}
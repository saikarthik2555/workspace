package vechicle;

public class Client {						//modify the code to add new vechicle
	private Vechicle vech;
	public Client(int number) {
		if(number==2) {
			vech=new TwoWheeler();
		}else if(number==3) {
			vech=new ThreeWheeler();
		}else if(number==4) {						
			//tight coupling -->
			// this class will define  type of class from main class 
			vech=new FourWheeler();					
		}else {											
			throw new IllegalArgumentException("Invalid Vechicle Type");
		}
	}
	
	public Vechicle getVechicleType() {
		return vech;
	}
	public void cleanObj() {
		if(vech!=null) {
			vech=null;					//responcible for lifecycle of created object
		}
	}

}

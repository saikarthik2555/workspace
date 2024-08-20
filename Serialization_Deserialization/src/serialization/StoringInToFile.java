package serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoringInToFile {
	public static void main(String[] args) throws IOException {
			FileOutputStream fos=new FileOutputStream("F:\\core_prg\\Serialization\\writeObject.txt");
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			try {
				oos = new ObjectOutputStream(fos);
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter The number of objects to create");
				int num=sc.nextInt();
				for(int i=0;i<num;++i) {
					Employee emp=Employee.getObject();	
					oos.writeObject(emp);
					System.out.println("Added "+1+" Object");
				}
				
				
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//to read the inserted data
			FileInputStream fis=new FileInputStream("F:\\core_prg\\Serialization\\writeObject.txt");
			try {
				int i=fis.read();
				while(true) {
					if(i==-1) {
						break;
					}else {
						System.out.print((char)(i));
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
	
	
	}
}

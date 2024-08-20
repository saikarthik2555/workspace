package _7ways_tofetch_Object;
import java.util.ListIterator;
import java.util.Vector;

//useful for printing reverse
public class ListIteratorDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(12);
		v.add(1,145);	//index,Obj
		v.add(23);
		//v.addAll(v);
		
		//cannot create obj for ListIterator Interface
		ListIterator<Integer> l=v.listIterator();	
		while(l.hasNext()) {
			System.out.print(l.next()+" ");
		}
		System.out.println();
		while(l.hasPrevious()) {
			System.out.print(l.previous()+" ");
		}
		System.out.println(l.previousIndex());
	}

}

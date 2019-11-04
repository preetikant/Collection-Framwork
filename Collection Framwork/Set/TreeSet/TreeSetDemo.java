import java.util.*;
public class TreeSetDemo{
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("Neha");
		t.add("Priya");
		
		//t.add(new Integer(10));//ClassCastException
		//t.add(null); //NullPointerException
		System.out.println(t);//[A,Neha,Priya,null,0]
	}
}
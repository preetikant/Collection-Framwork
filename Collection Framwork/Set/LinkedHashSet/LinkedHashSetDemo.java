import java.util.*;
public class LinkedHashSetDemo{
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add("A");
		h.add("Neha");
		h.add("Priya");
		h.add(null);
		h.add(0);
		System.out.println(h.add("A"));//fals
		System.out.println(h);//[A,Neha,Priya,null,0]
	}
}
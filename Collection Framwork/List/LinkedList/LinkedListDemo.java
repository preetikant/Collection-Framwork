import java.util.*;
public class LinkedListDemo{
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("preeti");
		l.add(10);
		l.add("kant");
		l.add("helo");
		System.out.println(l);//[preeti,10,kant,helo]
		l.set(0,"didi");
		System.out.println(l);//[didi,10,kant,helo]
		l.add(0,"oshine");
		System.out.println(l);//[oshine,didi,10,kant,helo]
		l.addFirst("mummy");
		System.out.println(l);//[mummy,oshine,didi,10,kant,helo]

	}
}
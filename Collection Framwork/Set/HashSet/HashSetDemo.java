import java.util.*;
public class HashSetDemo{
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("A");
		h.add("Neha");
		h.add("Priya");
		h.add(null);
		h.add(0);
		System.out.println(h.add("A"));
		System.out.println(h);
	}
}
import java.util.*;
public class TreeSetComparatorDemo{
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("shweta");
		t.add("preeti");
		t.add("poonam");
		t.add("versha");
		System.out.println(t);
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1 = obj1.toString();
		String s2 = (String)obj2;
		//return -s1.compareTo(s2); // descending order of name
		//return s2.compareTo(s1); //descending order of name
		//return s1.compareTo(s2); //ascending order
			return -s2.compareTo(s1); //descending order of name
	}
}
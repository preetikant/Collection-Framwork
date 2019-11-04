import java.util.*;
class ListIteratorDemo{
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("preeti");
		l.add("oshine");
		l.add("didi");
		l.add("bhaiya");
		System.out.println(l); 
		ListIterator itr = l.listIterator();
		while(itr.hasNext()){
			String j = (String)itr.next();
			if (j.equals("preeti")) {
				itr.remove();
			}
			else if(j.equals("oshine")){
				itr.set("nidhi");
			}
			else if(j.equals("didi")){
				itr.add("rm3");
			}
			
		}
		System.out.println(l);
		
	}
}
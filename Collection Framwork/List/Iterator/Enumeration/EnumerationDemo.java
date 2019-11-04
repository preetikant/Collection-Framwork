import java.util.*;
class EnumerationDemo{
	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i=0;i<=10 ;i++ ) {
			v.addElement(i);
		}
		System.out.println(v); // [0,1,2,3,4,5,6,7,8,9,10]
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Integer j = (Integer)e.nextElement();
			if (j%2==0) {
				System.out.println(j);
			}
			
		}
		
	}
}
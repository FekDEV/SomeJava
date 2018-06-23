package Collections;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


@SuppressWarnings("all")
public class Collections2 {
	
	public static void main(String[] args) {
		
		//LinkedLists:
		List l=new LinkedList();
		l.add(5);
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		//OR:
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		
		//Hashtables :
		Hashtable ht=new Hashtable();
		ht.put(1,"fekher");
		ht.put(2,"yosra");
		
		Enumeration e=ht.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//Hashsets :
		HashSet hs=new HashSet();
		hs.add(55);
		hs.add(64);
		hs.add(55);
		
		Iterator lit=hs.iterator();
		
		for(int i=0;i<hs.size();i++) {
			System.out.println(lit.next());
		}
		
		Object[] obj=hs.toArray();
		

		
		
		
	}

}

package Collections;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.lang.*;

@SuppressWarnings("all")
public class Collections {
	
	
	public static void main(String[] args) {
		
		//LinkedLists :
		List l=new LinkedList();
		l.add(12);
		l.add("toto");
		
		for(int i=0;i<l.size();i++) {
			System.out.println("L'element "+i+" : "+l.get(i));
		}
		
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		
		//Maps : Hashtable
		Hashtable ht=new Hashtable();
		ht.put(1,"Fek");
		
		Enumeration e=ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		//Set :
		HashSet hs = new HashSet();
		hs.add(55);
		hs.add(12);
		 
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Object[] obj=hs.toArray();
		}
		
	}	


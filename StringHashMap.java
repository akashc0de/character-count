package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class StringHashMap {

	public static void main(String[] args) {
		//count of each character given string
		String s="ammaappa";
		
		
		
		TreeMap<Character,Integer> charcount= new TreeMap();
		char[] c=s.toCharArray();
		for(char cc: c){
			if(charcount.containsKey(cc)) {
				charcount.put(cc, charcount.get(cc)+1);
			}
			else {
				charcount.put(cc, 1);
			}
		}
		Set s1=charcount.entrySet();
		System.out.println(s1);
		
		Iterator i= s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//output
		/*[a=4, m=2, p=2]
				a=4
				m=2
				p=2 */

	}

}

package CollectionFrameworkDS;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	/*A LinkedHashSet is a collection 
	 * that stores unique elements and 
	 * remembers the order they were added.
	 */

	public static void main(String[] args) {
	Set<String> linkedhashset =  new LinkedHashSet<String>();

	linkedhashset.add(null);
	linkedhashset.add("B");
	linkedhashset.add("A");
	linkedhashset.add("C");
	System.out.println(linkedhashset);


		}

	}



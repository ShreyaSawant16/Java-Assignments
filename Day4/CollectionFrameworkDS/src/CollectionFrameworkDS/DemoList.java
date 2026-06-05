package CollectionFrameworkDS;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
	

		public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			ArrayList<String> l1 = new ArrayList<String>();

			list.add(null);
			list.add("Apple");
			list.add("Apple");
			list.add("Orange");

			System.out.println(list);
		}
	}


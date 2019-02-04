package arrayList;

import java.util.ArrayList;

public class ArrayList_001 {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	  
	      alist.set(1, "Babu");
	      
	      for(String s:alist) 
	      {
	    	  
	    	  System.out.print(s+ ", ");
	      }
	      
	      alist.add("babu");
	      alist.add("gayu");
	      
	      
	      //alist.clear();//It is used for removing all the elements of the array list in one go. The below code will remove all the elements of ArrayList whose object is obj.
	      System.out.println(alist);
	}

}

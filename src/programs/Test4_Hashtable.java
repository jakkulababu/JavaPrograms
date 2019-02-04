package programs;

import java.util.HashMap;
import java.util.Map;

public class Test4_Hashtable 
{
	public static void main(String[] args) 
	{
		System.out.println("Hash map table");
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(101, "babu");
		hm.put(102, "gayu");
		hm.put(103, "nitu");
		hm.put(104, "ciru");
		hm.put(105, "Unknown");
		hm.put(106, "unknow2");
		System.out.println(hm.size());
		System.out.println(hm.get(102));
		hm.remove(105);
		hm.replace(106, "Idoit");
		System.out.println(hm.size());
		for(Map.Entry<Integer, String> entry : hm.entrySet()) 
		{
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" : "+value);
		}
	}
}
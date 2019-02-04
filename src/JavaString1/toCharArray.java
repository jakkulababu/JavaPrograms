package JavaString1;

public class toCharArray {

	public static void main(String[] args) 
	{
		String str1="abcdefghijklmnopqrstuvwxyz";
		char array[]=str1.toCharArray();
		for(int temp:array) {System.out.print(temp+" ");}System.out.println();
		for(char temp:array) {System.out.print(temp+"    ");}System.out.println();
		for(int i=1;i<=str1.length();i++) {System.out.print(i+"   ");}System.out.println();
		
		byte[] array1=str1.getBytes();	for(byte b:array1) {System.out.print(b+"  ");}
		
	}
}
package programs;
/*Unicode character:-
Unicode is a character encoding standard that has widespread acceptance. Microsoft software uses Unicode at its core. 
Whether you realize it or not, you are using Unicode already! Basically, “computers just deal with numbers. 
They store letters and other characters by assigning a number for each one. Before Unicode was invented, 
there were hundreds of different encoding systems for assigning these numbers. No single encoding could contain enough characters.1” 
This has been the problem we, in SIL, have often run into. If you are using a legacy encoding your font conflicts with 
the font someone in another area of the world uses. You might have an  in your font while someplace else someone used a  at the same 
codepoint. Your files are incompatible. Unicode provides a unique number for every character and so you do not have this problem
 if you use Unicode. If your document calls for U+0289  it will be clear to any computer program what the character should be.
*/

public class Test002_Char 
{
	public static void main(String args[]) 
	{
		char a1='A';
		System.out.println(a1);
		char c1='\u002B',c2='\u002D',c3='\u002A',c4='\u002F',c5='\u0025';
		System.out.println("Operational");
		System.out.println("Plus: "+c1+"\nMinus: "+c2+"\nMyltiply: "+c3+"\nDivision: "+c4+"\nModular: "+c5+"\n");
		System.out.print("Logical operations");
		char and='\u0026';
		char or='\u007C';
		char squar='\u005E';
		char not='\u0021';
		System.out.println("\n"+and+" "+or+" "+squar+" "+not);
		
		char a='\u0041',b='\u0042',c='\u0043',d='\u0044',e='\u0045',f='\u0046',g='\u0047',h='\u0048',i='\u0049',j='\u004A',k='\u004B',l='\u004C',m='\u004D',n='\u004E',o='\u004F',p='\u0050',q='\u0051',r='\u0052',s='\u0053',t='\u0054',u='\u0055',v='\u0056',w='\u0057',x='\u0058',y='\u0059',z='\u005A';
		System.out.println("\n"+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z);
	
		char c10='a';
		char c11='b';
		int i2=c10+c11;
		System.out.println(i2);
		
		
		
		
		
	}
 }
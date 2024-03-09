package week7;

import java.lang.String;
import java.lang.StringBuffer;
public class StringDemo1 {
	public static void main(String args[]) {
		System.out.println("this code illustrates use of string class and its methods");
		System.out.println("*******************");
		String str=new String("train your mind to see good in everything");
		System.out.println("the initial String is:\t"+str);
		System.out.println("after replacing'o'with'o':\t"+str.replace('0','0'));
		System.out.println("the length of given string is:\t"+str.length());
		System.out.println("the occurance of characters G is at position:\t"+str.indexOf('G'));
		System.out.println("the lower case iof string is:\t"+str.toLowerCase());
		System.out.println("the upper case iof string is:\t"+str.toUpperCase());
		System.out.println("the extracted sub string is:\t"+str.substring(27));
		String s="            hello world         " ;
		System.out.println("the string with spaces:"+s);
		System.out.println("the string with leading and traling spaces:/t"+s);
		System.out.println("the string without space:"+s.trim());
		if (s.isEmpty())
			System.out.println("the string is Empty");
		else
			System.out.println("the string is not empty.it contains"+s);
		s=null;
		System.out.println("*************\n\n");
		System.out.println("this code illustrates use of buffer class and its methods");
		System.out.println("***************");
		StringBuffer strbuf=new StringBuffer();
		System.out.println("the initial capacity of string buffer is"+ strbuf.capacity());
		strbuf.append("hello");
		System.out.println("the string buffer is:\t"+strbuf);
		strbuf.setLength(20);
		strbuf.insert(5,"welcome to world of java");
		System.out.println("the stringbuffer is:\t"+strbuf);
		System.out.println("the capacity of string buffer after appending+str"+strbuf.capacity());
		System.out.println("the reverse of given string buffer is:\n"+strbuf.reverse());
		System.out.println("the stringbuffer after deleting\t"+strbuf.delete(5,43));
		System.out.println("*******************");	
	}
}
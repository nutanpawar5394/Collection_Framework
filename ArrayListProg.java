import java.util.*;
import java.io.*;
import java.lang.*;

class ArrayListProg
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList <Integer> al=new ArrayList<Integer>();
		
		al.add(11);
		al.add(21);
		al.add(51);
		int i=Integer.parseInt(br.readLine());
		al.add(1,i);
		System.out.println(al);
		al.remove(2);
		
		System.out.println(al);
	}
}
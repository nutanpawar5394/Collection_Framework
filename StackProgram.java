import java.util.*;
import java.lang.*;
import java.io.*;

class StackProgram
{
	public static void main(String args[])  throws Exception
	{
		int position=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		Stack <String> st=new Stack<String>();
		
		//	String str=br.readLine();
		
		//st.push(str);
		//System.out.println(st);
		st.push("Nutan");
		st.push("Amit");
		st.push("Deshmukh");
		
		//st.pop();
		
		position=st.search("Amit");
		System.out.println(position);
		
	}

}

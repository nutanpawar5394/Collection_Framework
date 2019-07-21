//Accept string and display frequency of each charcter from string
import java.util.*;
import java.lang.*;

class FrequencyOfCharacter
{
	public static void main(String args[])
	{
		int i=0,icnt=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str=sobj.nextLine();
		
		char arr[]=str.toCharArray();
		
		HashMap < Character,Integer> hobj = new HashMap <Character,Integer>();
		
		for(i=0;i<arr.length;i++)
		{
			//icnt++;
			if(hobj.containsKey(arr[i]))
			{
				icnt=hobj.get(arr[i]);
				hobj.put(arr[i],icnt+1);
			}
			else
			{
				hobj.put(arr[i],1);
			}
			
		}
		System.out.println(hobj);
	}
}
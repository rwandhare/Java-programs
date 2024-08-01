//Write a program to print palindrome number.
class palindrome
{
public static void main (String args [])
	{
	 int num=121;
	 int sum=0;
	 while(temp>0)
		
	  {
		int rem=temp%10;
		sum=(sum*10)+rem;
		temp=temp/10;
	  }
	  if(num==sum)

		{
		 System.out.println("Number is palindrome");
		}

	  else
		{
		 System.out.println("Number is not palindrome");

		}
	}


}

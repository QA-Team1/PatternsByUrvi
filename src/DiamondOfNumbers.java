
public class DiamondOfNumbers {

	public static void main(String[] args) 
	{
		int count=1;
		
	 	for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print(i+" ");
			}
			
			    System.out.println();
	}

	 	for (int i = 4-1; i>= 1; i--) 
		{
			for (int j = 4-i; j>=1; j--) 
			{ System.out.print(" "); }
											  
			 for(int k=1; k<=i; k++)
			{
				System.out.print(" " +i);
			}
			System.out.println();
	}
	}
}



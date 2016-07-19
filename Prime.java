public class Prime {

	
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a==0||a==1)
		{
			System.out.println(+a+ "is neither prime nor composite");
		}
		else
		{
			int z=0;
			for(int i=2;i<a/2;i++)
			{
				if(a%2==0)
					z=1;
				break;
			}
			if(z==1)
			{
				System.out.println(+a+ "is not a prime number");
			}
			else
			{
				System.out.println(+a+ "is prime number");
			}
		}
	}

}

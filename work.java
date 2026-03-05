class work 
{
	public static void main(String[] args) 
	{
		int x=12;
		int count=0;
		boolean work=true;
		for(int i=1;i<=12;i++){
			if(x%i==0){
			  count++;
			}
		}
		if(work){
			System.out.println("prime number");
		}
		else
			System.out.println("not a prime");
	}
}
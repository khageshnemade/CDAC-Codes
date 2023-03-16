class pattern7{
	public static void main(String[] args){
	
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
				
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			//if(k!=1)System.out.print("*");
			}
    for(int k=1;k<i;k++){System.out.print("*");}
			
						
			
			System.out.println();
		}
		for(int i=1;i<4;i++){
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			for(int j=3;j>=i;j--){
				System.out.print("*");
				if(j!=3)System.out.print("*");
			}
			System.out.println();
		}
	
}	
}
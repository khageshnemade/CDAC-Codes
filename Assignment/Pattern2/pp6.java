class pp6{
	static public void main(String[] args){
		for(int i=1; i<=9;i++){
			for (int j=1;j<i;j++){
					System.out.print(" ");
				}
			for(int j=i;j<=9;j++){
				
				System.out.print("* ");
			}
		
			System.out.println();
		}
	}
}
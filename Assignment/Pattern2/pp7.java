class pp7{
	static public void main(String[] args){int k=9;
		for(int i=1; i<=9;i++){
			for (int j=1;j<i;j++){
					System.out.print(" ");
				}
			for(int j=i;j<=9;j++){
				
				System.out.print(k+" ");
			}
		k--;
			System.out.println();
		}
	}
}
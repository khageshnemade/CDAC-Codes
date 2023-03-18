class pp5{
	static public void main(String[] args){
		for(int i=1; i<=9;i++){
			for (int j=9;j>i;j--){
					System.out.print("  ");
				}
			for(int j=10-i;j<=9;j++){
				
				System.out.print(j+" ");
			}
			for(int j=8;j>9-i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
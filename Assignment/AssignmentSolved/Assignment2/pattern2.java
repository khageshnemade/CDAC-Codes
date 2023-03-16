class pattern2{
	public static void main(String[] args){
		for(char i=65;i<=70;i++){
			for(int j=65;j<=i;j++){if(j<i){System.out.print((char)j);}}
			System.out.println();
		}	
}}
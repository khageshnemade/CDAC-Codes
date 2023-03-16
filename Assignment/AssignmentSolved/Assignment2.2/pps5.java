class pps5{
	static public void main(String[] args){
for(int i=1;i<6;i++){
	for(int j=6;j>i;j--){
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++){
	if(j==1||j==i)System.out.print("* ");
	else System.out.print("  ");}
	System.out.println();
	}
	for(int j=1;j<=6;j++){
		System.out.print("* ");
	}
	}
}
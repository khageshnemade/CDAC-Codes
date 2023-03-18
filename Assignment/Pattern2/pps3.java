class pps3{
	static public void main(String[] args){
		int n=15;
for(int i=1;i<=n;i++){System.out.print("* ");} System.out.println();
for(int i=1;i<n;i++){
	for(int j=i;j<n;j++){
	if(j==i||j==n-1)System.out.print("* ");
	else System.out.print("  ");
	}
	System.out.println();
}
	}
}
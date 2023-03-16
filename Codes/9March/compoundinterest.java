class ci{
	public static void main(String[] args){
		int P =50000000;
		System.out.println("the value of loan is "+P);
		double roi= 10.75;
		System.out.println("the noo of years is 5 years ");
System.out.println("the roi of loan is "+roi);

	double ci= P * ( (1 + roi/100)*(1 + roi/100)*(1 + roi/100)*(1 + roi/100)*(1 + roi/100))- P;
System.out.println("the compoundinterest is "+ci);		
	}
}
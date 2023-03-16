class grosssalary {
	public static void main(String[] args){
		double Basic = 10000.8989009;
		System.out.println("Basicsalary is "+ Basic);
		double DA = .14*Basic;
		System.out.println("DAis "+ DA);
		double TA = 5600.6778;
				System.out.println("TA  is "+ TA);
		double petrolA= 7000.3443534546;
		System.out.println("petrol allowance is is "+ petrolA);
		double taxdeduction = .0175*DA;
		System.out.println("taxdeduction is "+ taxdeduction);
		double GrossSalary = Basic + DA + TA + petrolA - taxdeduction;
		System.out.println("Gross salary is "+GrossSalary);
	}
}
class calculatePens{
	public static void main(String[] args){
		int numPens = 14;
		int numStudents = 3;

		int quantity = numPens/numStudents;
		int pensLeft = numPens % numStudents;

		System.out.println("The pen per student is " + quantity + " and the remaining pens is " + pensLeft);
	}
}
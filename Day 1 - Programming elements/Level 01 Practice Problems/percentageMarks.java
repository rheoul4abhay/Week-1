class percentageMarks{
	public static void main(String args[]){
		
		//name input of string type 
		String name = "Sam";

		/*Declaring multiple int datatype variables in single line below
  		  where each of them represent marks in different subjects
      		*/
		int mathsMarks = 94, marksPhysics = 95, marksChemistry = 96;
		
		//Calculating sum of marks scored 
		int totalMarks = mathsMarks + marksPhysics + marksChemistry;

		/*Used double datatype to add precision to the result
		and typecasted the values in int to double to avoid datatype 
		conflicts while calculation. */
		double percentage = (double)(totalMarks)/(double)(300) * 100;
		
		//Outputting the average percentage in PCM
		System.out.println(name + "'s average mark in PCM : " + percentage);
	}
}
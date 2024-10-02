package module1;

public class ControlStatementDemo1 {

	public static void main(String[] args) {
		int markScored = 87;
		String grade;
		if(markScored>=90) {
			grade = "O";
		}
		else if(markScored>=85 && markScored<90)
		{
			grade = "A+";			
		}
		else if(markScored>=80 && markScored<85) 
		{
			grade = "A";			
		}
		else if(markScored>=75 && markScored<80) {
			grade = "B+";			
		}
		else if(markScored>=70 && markScored<75) {
			grade = "B";			
		}
		else if(markScored>=65 && markScored<70) {
			grade = "C+";			
		}
		else if(markScored>=60 && markScored<65) {
			grade = "C";			
		}
		else if(markScored>=55 && markScored<60) {
			grade = "D";			
		}
		else if(markScored>=50 && markScored<55) {
			grade = "P";			
		}
		else {
			grade = "F";
		}
		System.out.println("Grade of the student who "
				+ "scored: "+markScored+" is: "+grade);

	}

}
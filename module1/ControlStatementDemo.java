package module1;


public class ControlStatementDemo {

	public static void main(String[] args) {
		float internalMarksForAttendance;
		float attendancePercentage = 62.35f;
		if(attendancePercentage>=90) {
			internalMarksForAttendance = 10;
		}
		else {
			internalMarksForAttendance = attendancePercentage/10;
		}
		System.out.println("Internal Marks for Attendance: "
				+ ""+internalMarksForAttendance);
	}
}

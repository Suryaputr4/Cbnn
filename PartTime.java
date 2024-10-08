package SuperClass;

public class PartTime extends person{
      private int hoursWorked;

      public PartTime(){
            hoursWorked = 0;
      }

      public PartTime (String name, int age, int studentNumber, int score, String major, String subject, int AnualSalary, String unit, int HoursWorked) {
            this.hoursWorked = hoursWorked;
      }

	public int getHoursWorked() {
		return this.hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

      public void print (){
            System.out.print("HoursWorked : \t" + hoursWorked);
      }

}
package SuperClass;

public class FullTime extends person {
          private int AnualSalary;
          private String unit;

          public FullTime(){
            AnualSalary = 0;
            unit = "";
          }

          public FullTime (String name, int age, int studentNumber, int score, String major, String subject, int AnualSalary, String unit) {
            this.AnualSalary = AnualSalary;
            this.unit = unit;
          }
        
	public int getAnualSalary() {
		return this.AnualSalary;
	}

	public void setAnualSalary(int AnualSalary) {
		this.AnualSalary = AnualSalary;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
    
    public void print(){
    System.out.print("Salary : \t"+AnualSalary);
}
}
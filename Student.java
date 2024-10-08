package SuperClass;

public class Student extends person {
            private int studentNumber;
            private int score;
            private String major;

            public Student(){
                  studentNumber = 0;
                  score = 2;
                  major = "";
            }

            public Student (String name, int age, int studentNumber, int score, String major) {
                  super(name, age);
                  this.studentNumber = studentNumber;
                  this.score = score;
                  this.major = major;
            }

	public int getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

      public void print(){
            System.out.print("Student Number : \t"+studentNumber);
            System.out.print("Score : \t"+score);
            System.out.print("Major : \t"+major);
      }

      }
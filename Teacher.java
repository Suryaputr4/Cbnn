package SuperClass;

import javax.security.auth.Subject;

public class Teacher extends person {
      private String subject;

      public Teacher(){
            this.subject = "";
      }

      public Teacher (String name, int age, int studentNumber, int score, String major, String subject) {
            this.subject = subject;
      }

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

      public void print(){
            System.out.print("Subject : \t"+subject);
      }
}
//STUDENT CLASS FOR QUESTION 4

package u3165466A1;

class Student implements Comparable <Student>{
	
	int StudentID;
	String FirstName;
	String LastName;
	double Score;
	String Grade;
	//double FinalMark;
	
	Student (int StudentID, String FirstName, String LastName, double Score, String Grade){
	
		super();
		this.StudentID = StudentID;
		this.FirstName= FirstName;
		this.LastName=LastName;
		this.Score=Score;
		this.Grade=Grade;
	}
	
	public int getStudentID() {
	    return StudentID;
	}

	public String getFirstName() {
	    return FirstName;
	}

	public String getLastName() {
	    return LastName;
	}

	public double getScore() {
	    return Score;
	}

	public String getGrade() {
	    return Grade;
	}

	
	@Override
	public int compareTo(Student s) {
		
		if(this.Score == s.Score) {
			if(this.FirstName.compareTo(s.FirstName)==0) {
				if(this.LastName.compareTo(s.LastName)==0) {
					return(this.StudentID-s.StudentID)>0? 1 : -1;
					
				} else {
					return this.LastName.compareTo(s.LastName);
				}
			} else {
				return this.FirstName.compareTo(FirstName);
			}
		}else {
			return(s.Score - this.Score) > 0 ? 1:-1;
		}
			
		
	}
}
	
	//@Override
	/*public String toString() {
	    return "Student{" + "studentID=" + StudentID + ", mark=" + Score + ", fName=" + FirstName + ", lName=" + LastName + ", grade=" + Grade + '}';
	}

	}
	*/


public class Student {

  	private String studentID;
  	private String studentName;
  	private Integer year;
  	private String major;
  	private ArrayList<Courses> courseList;  //????indexGroupClass,<indexGroup>,contain vacancy, Students?????//
  	// Creates a new Course with given ID, name, AU, waitList of index group, structure, component
  	public Student(String studentID, String studentName, String major, Integer year, ArrayList<Courses> courseList) {
  		this.studentID = studentID;
  		this.studentName = studentName;
  		this.major = Major;
  		this.year = courseType;
  		this.courselist = courseList;
  	}
  /*-----------------------get&set attributes-------------------------- */
  	// Get the ID of the course
  	public void setStudent() {
  		return this.courseID;
  	}
  	// Change the ID of the course
  	public void viewCourseRegistered() {
      Course c1 = new Course();
      for (int k = 0; k < this.getCourseList().size(); k++) {

			System.out.print((k + 1 + ") " + this.getCourseList().get(k) + " "
					+ c1.getCourseID() + " Registered" + '\n');
		}

      if (this.getCourseList().size() == 0) {
			System.out.println("You have no courses registered!\n");
		}

  	}
    public String getStudentID() {
  		return this.studentID;
  	}
  	// Change the ID of the course
  	public String getMajor() {
  		return this.major;
  	}
  /*------------------------------------------------------------------ */
  	// Get the name of the course
  	public String getStudentName() {
  		return this.StudentName;
  	}
  	// Change the name of the course
    ----------------------------------------------------- */
  	// Get the AU of the course
  	public int getYear() {
  		return this.year;
  	}
  /*------------------------------------------------------------------ */
  	// Get the name of the course
    public ArrayList<Course> getCourseList() {
		return courseList;
	}



}

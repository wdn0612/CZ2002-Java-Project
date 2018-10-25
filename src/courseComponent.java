
public class courseComponent {
    
	private Boolean lec;
	private Boolean tut;
	private Boolean lab;
	
/*-------------------------constructor---------------------------- */	
	// Creates a new courseComponent without specified attributes
	public courseComponent() {
		
	}
	// Create a new courseComponent with given lec, tut, lab information
	public courseComponent(Boolean lec, Boolean tut, Boolean lab) {
		this.lec = lec;
		this.tut = tut;
		this.lab = lab;
	}
/*---------------------------------------------------------------- */
	// Get the components of a course
	public Boolean hasLec() {
		return this.lec;
	}
	public Boolean hasTut() {
		return this.tut;
	}
	public Boolean hasLab() {
		return this.lab;
	}
	// Change the components of a course
	public void setLec(Boolean lec) {
		this.lec=lec;
	}
	public void setTut(Boolean tut) {
		this.tut=tut;
	}
	public void setLab(Boolean lab) {
		this.lab=lab;
	}
/*---------------------------------------------------------------- */
	// Print component of course
	public void viewCourseComponent() {
		System.out.println("The component of this course:");
		if(this.lec==true)
			System.out.println("Lecture");
		if(this.tut==true)
			System.out.println("Tutorial");
		if(this.lab==true) 
			System.out.println("Lab");
	}
}

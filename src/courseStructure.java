
public class courseStructure {

	private double finalExam;
	private double quiz;
	private double assignment;
	private double project;
	private double participation;
	
/*-------------------------constructor---------------------------- */
	// Creates a new courseStructure without specified attributes
	public courseStructure() {
		
	}
	// Create a new courseStructure given weight of finalExam, quiz, assignment, project, participation
	public courseStructure(double finalExam, double quiz, double assignment, double project, double participation) {
		this.finalExam=finalExam;
		this.quiz=quiz;
		this.assignment=assignment;
		this.project=project;
		this.participation=participation;
	}
/*---------------------------------------------------------------- */
	// Get the weight of each assessment
	public double getWeightOfFinal() {
		return this.finalExam;
	}
	public double getWeightOfQuiz() {
		return this.quiz;
	}
	public double getWeightOfAssignment() {
		return this.assignment;
	}
	public double getWeightOfProject() {
		return this.project;
	}
	public double getWeightOfParticipation() {
		return this.participation;
	}
	// Set the weight of each assessment
	public void setWeightOfFinal(double finalExam) {
		this.finalExam=finalExam;
	}
	public void setWeightOfQuiz(double quiz) {
		this.quiz=quiz;
	}
	public void setWeightOfAssignment(double assignment) {
		this.assignment=assignment;
	}
	public void setWeightOfProject(double project) {
		this.project=project;
	}
	public void setWeightOfParticipation(double participation) {
		this.participation=participation;
	}
}

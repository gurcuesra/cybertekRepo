
public class StudentTask {
	public String name;
	public int age;
	public char gender;
	public int year;
	public String course;
	public static String university="Cybertek";

	public StudentTask(String name, int age, char gender, int year, String course) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	
	public void attendLecture() {
		System.out.println(name + " attended the lecture at "+ university);
	}
	
	public void submitAssignment() {
		System.out.println(name + " submitted assignment at "+ university);
	}
	
	public void attendLab() {
		System.out.println(name + " attended the lab at "+ university);
	}
}

package cap04;

public class Student {

	private String name;
	private double average;
	
	//construtor
	public Student(String name, double average) {
		this.name = name;
		
		if (average >= 0.0 && average <= 100)
			this.average = average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		if (average >= 0.0 && average <= 100)
			this.average = average;
	}
	
	//determina a retorna a letra da nota de Student
	public String getLetterGrade() {
		String letterGrade = ""; //inicializando uma uma String vazia
		
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
	
}

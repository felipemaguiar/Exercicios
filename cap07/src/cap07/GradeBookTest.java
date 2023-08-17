package cap07;

public class GradeBookTest {

	public static void main(String[] args) {
		// array de notas de aluno
		int[] notasArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", notasArray);
		System.out.printf("Bem vindo ao livro de notas de%n%s%n%n", myGradeBook.getNomeCurso());
		myGradeBook.processoNotas();
	}

}

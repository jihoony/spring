package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

    public static void main(String[] args) {
		/**
		 * Dependency Injection
		 * 부품을 교체하는 작업으로 생각하면 된다.
		 * Exam 인스턴스를 InlineExamConsole 혹은 GridExamConsole에 부품을 끼워 넣듯이 넣는것이 DI 이다.
		 * 지금은 DI를 사람이 하지만 Spring을 사용하면 DI의 주체가 Spring이 되며 DI를 하기위한 설명서가 필요하다.
		 */

		Exam exam = new NewlecExam();

	    //ExamConsole console = new InlineExamConsole(exam); // Dependency Injection
		ExamConsole console = new GridExamConsole(exam); // Dependency Injection

	    console.print();
    }
}

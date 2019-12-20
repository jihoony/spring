package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

    public static void main(String[] args) {

		/**
		 * Exam 객체와 ExamConsole 객체를 생성하고, ExamConsole 객체에 Exam 객체를 주입하도록
		 * setting.xml의 설정을 통해 스프링에 지시하는 방식으로 아래 코드를 변경한다.
		 *
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole(); // Dependency Injection
		console.setExam(exam);
		*/

		ExamConsole console = ??;
		/**
		 * run
		 */
		console.print();
    }
}

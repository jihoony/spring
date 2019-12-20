package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

    public static void main(String[] args) {
		/**
		 * create 2 modules
		 * -> need to fix
		 */
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole(); // Dependency Injection

		/**
		 * Injection
		 * -> need to fix
		 */
		console.setExam(exam);

		/**
		 * run
		 */
		console.print();
    }
}

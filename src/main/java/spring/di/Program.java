package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

import java.util.List;

public class Program {

    public static void main(String[] args) {

		ApplicationContext context =
//				new ClassPathXmlApplicationContext("setting.xml");
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);

//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());

//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

//		List<Exam> exams = (List<Exam>) context.getBean("exams");
//		exams.add(new NewlecExam(1,1,1,1));

//		for (Exam e : exams)
//			System.out.println(e.toString());
    }
}

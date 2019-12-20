package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.ui.ExamConsole;

public class Program {

    public static void main(String[] args) {

		/**
		 *
		 * Spring에서 제공하는 ApplicationContext는 4가지 종류가 있다.
		 * 1. ClassPathXmlApplicationContext: 프로젝트의 루트디렉토리에서  ApplicationContext를 xml 파일에서 생성한다.
		 * 2. FileSystemXmlApplicationContext: 파일 시스템에서 ApplicationContext를 xml 파일에서 생성한다.
		 * 3. XmlWebApplicationContext: Web의 URL을 통해서 ApplicationContext를 생성한다.
		 * 4. AnnotationConfigApplicationContext: Java Class의 Annotation을 통하여 ApplicationContext를 생성한다.
		 *
		 * ApplicationContext context = new ClassPathXmlApplicationContext("spring.di.setting.xml");
		 * Spring에서 제공하는 ApplicationContext를 사용하여 설정을 읽어서 IoC Container에 Bean들을 담아둔다.
		 *
		 * ExamConsole console = (ExamConsole) context.getBean("console");
		 * 이름이 console인 Bean을 찾아서 가져온다.
		 *
		 * ExamConsole console = context.getBean(ExamConsole.class);
		 * Class 타입이 ExamConsole인 Bean을 가져온다.
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("setting.xml");

		// case1. bean의 id로 선언된 이름으로 가져오고 이때 casting이 필요하다.
//		ExamConsole console = (ExamConsole) context.getBean("console");

		// case2. bean의 classType으로 가져온다.
		ExamConsole console = context.getBean(ExamConsole.class);
		/**
		 * run
		 */
		console.print();
    }
}

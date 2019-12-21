package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

    @Autowired
    @Qualifier("exam1")
    private Exam exam;

//    public InlineExamConsole() {
//        System.out.println("constructor");
//    }

    public InlineExamConsole(Exam exam) {
        System.out.println("overload constructor");
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.format("total is %d, avg is %f\n", exam.total(), exam.avg());
    }

    @Override
    public void setExam(Exam exam) {
        System.out.println("setter");
        this.exam = exam;
    }
}

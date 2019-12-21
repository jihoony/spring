package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

    private Exam exam;

    public InlineExamConsole() {
        System.out.println("constructor");
    }

    @Autowired
    public InlineExamConsole(@Qualifier("exam1")Exam exam, @Qualifier("exam2")Exam exam2) {
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

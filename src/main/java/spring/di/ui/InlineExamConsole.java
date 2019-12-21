package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

    private Exam exam;

    public InlineExamConsole() {
    }

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.format("total is %d, avg is %f\n", exam.total(), exam.avg());
    }

    @Override
    @Autowired
    @Qualifier("exam1")
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}

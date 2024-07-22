package JavaBasic.Constructor;

public class Exam {

    int id;
    int score;


    Exam(int id, int score) {
        this.id = id;
        this.score = score;
    }

    Exam(Exam exam){
        this.id = exam.id;
        this.score = exam.score;
    }
}

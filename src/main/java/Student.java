public class Student {

    private int id;
    private MathCheat mathCheat;

    public Student(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public Student() {

    }

    public void cheating() {
        mathCheat.mathCheat();
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void setId(String id) {
    }
}

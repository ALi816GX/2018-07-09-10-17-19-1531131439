package practice07;

public class Klass {

    private int number;

    public Klass(int number) {
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int num) {
        this.number = num;
    }

    public String getDisplayName() {
        return "Class "+ number;
    }
}

package practice08;

public class Klass {

    private int number;
    private String leader;

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

    public void assignLeader(Student tom) {
        leader = tom.getName();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}

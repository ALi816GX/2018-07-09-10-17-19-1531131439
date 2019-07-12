package practice08;

public class Student extends Person{

    private Klass klass;

    public Student(int id ,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;

    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }


    @Override
    public String introduce() {
        String result = super.introduce() + " I am a Student.";
        if(klass!= null&&klass.getLeader()!= null&&klass.getLeader().equals(this.getName())){
            result += " I am Leader of Class "+this.getKlass().getNumber()+".";
        }else {
            result +=  " I am at Class "+klass.getNumber()+".";
        }
        return  result;
    }

}

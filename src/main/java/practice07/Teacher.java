package practice07;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(String name, int age,Klass klass) {
        super(name, age);
        this.klass = klass;

    }

    public Teacher(String name, int age) {
        super(name,age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass!=null && klass.getNumber() != 0) {
            return super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }


    public String introduceWith(Student jerry) {

        if(this.klass.getNumber() == jerry.getKlass().getNumber()){
            return super.introduce()+" I am a Teacher. I teach "+jerry.getName()+".";
        }else {
            return super.introduce()+" I am a Teacher." + " I don't teach "+jerry.getName()+".";
        }


    }
}

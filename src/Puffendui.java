public class Puffendui extends Hogwarts {
    private int industrious;
    private int loyalty;
    private int honesty;

    public void compareStudents(Puffendui secondStudent) {
        int powerOfFirstStudent = this.industrious + this.loyalty + this.honesty;
        int powerOfSecondStudent = secondStudent.industrious + secondStudent.loyalty + secondStudent.honesty;
        if (powerOfFirstStudent > powerOfSecondStudent) {
            System.out.println(this.fullName + " сильнее чем " + secondStudent.fullName);
        } else if (powerOfSecondStudent > powerOfFirstStudent) {
            System.out.println(secondStudent.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " силы равны " + secondStudent.fullName);
        }

    }
    public Puffendui(String fullName, int magic, int teleport,int industrious, int loyalty, int honesty) {
        super(fullName, magic, teleport);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return  "Я " + fullName +
                " Факультет Puffendui " +
                "industrious=" + industrious +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +

                ", magic=" + magic +
                ", teleport=" + teleport
                ;
    }
    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}

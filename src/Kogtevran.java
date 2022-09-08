public class Kogtevran extends Hogwarts {
    private int wits;
    private int wisdom;
    private int smart;
    private int creation;

    public void compareStudents(Kogtevran secondStudent) {
        int powerOfFirstStudent = this.wits + this.wisdom + this.smart+this.creation;
        int powerOfSecondStudent = secondStudent.wits + secondStudent.wisdom + secondStudent.smart+secondStudent.creation;
        if (powerOfFirstStudent > powerOfSecondStudent) {
            System.out.println(this.fullName + " сильнее чем " + secondStudent.fullName);
        } else if (powerOfSecondStudent > powerOfFirstStudent) {
            System.out.println(secondStudent.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " силы равны " + secondStudent.fullName);
        }

    }
    public Kogtevran(String fullName, int magic, int teleport, int wits, int wisdom, int smart, int creation) {
        super(fullName, magic, teleport);
        this.wits = wits;
        this.wisdom = wisdom;
        this.smart = smart;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Я " + fullName +
                "Факультет Kogtevran " +
                "wits=" + wits +
                ", wisdom=" + wisdom +
                ", smart=" + smart +
                ", creation=" + creation +
                ", magic=" + magic +
                ", teleport=" + teleport;
    }

    public int getWits() {
        return wits;
    }

    public void setWits(int wits) {
        this.wits = wits;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}

public class Griffindor extends Hogwarts {
    private int honour;
    private int nobility;
    private int bravery;


    public void compareStudents(Griffindor secondStudent) {
        int powerOfFirstStudent = this.honour + this.nobility + this.bravery;
        int powerOfSecondStudent = secondStudent.honour + secondStudent.nobility + secondStudent.bravery;
        if (powerOfFirstStudent > powerOfSecondStudent) {
            System.out.println(this.fullName + " сильнее чем " + secondStudent.fullName);
        } else if (powerOfSecondStudent > powerOfFirstStudent) {
            System.out.println(secondStudent.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " силы равны " + secondStudent.fullName);
        }

    }


    public Griffindor(String fullName, int magic, int teleport, int honour, int nobility, int bravery) {
        super(fullName, magic, teleport);
        this.honour = honour;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  "Я " + fullName +
                " Факультет Griffindor " +
                "honour=" + honour +
                ", nobility=" + nobility +
                ", bravery=" + bravery +

                ", magic=" + magic +
                ", teleport=" + teleport
                ;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}

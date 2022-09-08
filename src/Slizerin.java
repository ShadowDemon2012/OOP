public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public void compareStudents(Slizerin secondStudent) {
        int powerOfFirstStudent = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int powerOfSecondStudent = secondStudent.cunning + secondStudent.determination + secondStudent.ambition + secondStudent.resourcefulness + secondStudent.lustForPower;
        if (powerOfFirstStudent > powerOfSecondStudent) {
            System.out.println(this.fullName + " сильнее чем " + secondStudent.fullName);
        } else if (powerOfSecondStudent > powerOfFirstStudent) {
            System.out.println(secondStudent.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " силы равны " + secondStudent.fullName);
        }
    }

    public Slizerin(String fullName, int magic, int teleport, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magic, teleport);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Я "+ fullName+
                "Факультет Slizerin " +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", magic=" + magic +
                ", teleport=" + teleport;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}

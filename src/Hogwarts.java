public class Hogwarts {
    protected String fullName;
    protected int magic;
    protected int teleport;

    public void compareStudents(Hogwarts secondStudent) {
        int powerOfFirstStudent = this.magic + this.teleport;
        int powerOfSecondStudent = secondStudent.magic + secondStudent.teleport;
        if (powerOfFirstStudent > powerOfSecondStudent) {
            System.out.println(this.fullName + " сильнее чем " + secondStudent.fullName);
        } else if (powerOfSecondStudent > powerOfFirstStudent) {
            System.out.println(secondStudent.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " силы равны" + secondStudent.fullName);
        }

    }

    public Hogwarts(String fullName, int magic, int teleport) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setTeleport(int teleport) {
        this.teleport = teleport;
    }

}

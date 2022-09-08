
public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри Поттер", 65, 15, 24, 52, 70);
        Griffindor ronUizly = new Griffindor("Рон Уизли", 12, 23, 24, 52, 15);
        Puffendui zahariaSmit = new Puffendui("Захария Смит", 18, 23, 24, 52, 70);
        Puffendui sedrikDigori = new Puffendui("Сэдрик Дигори", 19, 23, 15, 52, 90);
        Kogtevran joyChang = new Kogtevran("Чжоу Чанг", 12, 48, 29, 55, 10,12);
        Kogtevran padmaPatil = new Kogtevran("Падма Патил", 28, 23, 24, 52, 70,40);
        Slizerin drakoMalfoy = new Slizerin("Драко Малфой", 66, 7, 24, 52, 70,15,90);
        Slizerin gregoriGoil = new Slizerin("Грегори гойл", 50, 3, 24, 52, 12,21,12);
        System.out.println(harryPotter);
        System.out.println(zahariaSmit);
        System.out.println(joyChang);
        System.out.println(drakoMalfoy);
        harryPotter.compareStudents(sedrikDigori);
        drakoMalfoy.compareStudents(padmaPatil);
        ronUizly.compareStudents(gregoriGoil);
    }

    }
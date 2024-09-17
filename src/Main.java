public class Main {
    public static void main(String[] args) {
//Задача №1
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 5.5f;
        double f = 6.66;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println(" ");
//Задача №2
        float aa = 27.12f;
        long bb = 987_678_965_549L;
        double cc = 2.786;
        short dd = 569;
        int ee = -159;
        int ff = 27897;
        byte gg = 67;
//Задача №3
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short sheetTotal = 480;
        int totalStudents = lpStudents + asStudents + eaStudents;
        int sheetStudent = sheetTotal / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetStudent + " листов бумаги");
        System.out.println();
//Задача №4
        int bottleMinute = 16 / 2;
        int bottle20Minute = 20 * bottleMinute;
        int bottleDay = 60 * 24 * bottleMinute;
        int bottle3Day = 3 * bottleDay;
        int bottleMomth = 30 * bottleDay;
        System.out.println("За 20 минут машина произвела " + bottle20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottle3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleMomth + " штук бутылок");
        System.out.println();

    }
}
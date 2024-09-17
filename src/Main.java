public class Main {
    public static void main(String[] args) {
//Задача №1
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4;
        float e = 5;
        double f = 6;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println(" ");
//Задача №2
        float aa = 27.12f;
        var bb = "987 678 965 549";
        double cc = 2.786;
        short dd = 569;
        short ee = -159;
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
//Задача №4
        byte bottleMinute=16/2;
        int bottle20Minute=20*bottleMinute;
        int bottleDay=1440*bottleMinute;
        int bottle3Day=4320*bottleMinute;
        int bottleMomth=43200*bottleMinute;
        System.out.println("За 20 минут машина произвела "+bottle20Minute+" штук бутылок");
        System.out.println("За сутки машина произвела "+bottleDay+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+bottle3Day+" штук бутылок");
        System.out.println("За месяц машина произвела "+bottleMomth+" штук бутылок");
        System.out.println(" ");

    }
}
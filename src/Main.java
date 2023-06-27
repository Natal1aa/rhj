// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задание 2");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task3() {
        System.out.println("Задание 3");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task4() {
        System.out.println("Задание 4");
        var boxerWeight1 = 78.2;
        System.out.println(boxerWeight1);
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight2);
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов " + totalWeight + "кг!");
        var cutterWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница веса между бойцов " + cutterWeight + "кг!");
        var differenceWeight = totalWeight % cutterWeight;
        System.out.println(differenceWeight);
    }

    public static void task5() {
        System.out.println("Задание 5");
        var numberOfHours = 640;
        System.out.println(numberOfHours);
        var worher = 8;
        System.out.println(worher);
        var totalEmployees1 = ("Всего работников в первой компании " + (numberOfHours / worher) + " человек.");
        System.out.println(totalEmployees1);
        var totalEmployees2 = 80 + 94;
        System.out.println("Во второй компании работает " + totalEmployees2 + " человек.");
        var totalHours = totalEmployees2 * 8;
        System.out.println("Если в компании работает " + totalEmployees2 + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками.");
    }

    public static void task6() {
        System.out.println("Задание 6");
        byte a = 100;
        short b = 1000;
        int c = 2000;
        long d = 3000;
        long s = a + b + c + d;
        System.out.println(s);
    }

    public static void task7() {
        System.out.println("Задание 7");
        float a = 2.786f;
        double b = 27.12;
        byte c = 67;
        short e = 27897;
        int s = 569;
        long g = -159;
    }

    public static void task8() {
        System.out.println("Задание 8");
        byte a = 23;
        System.out.println(a);
        byte b = 27;
        System.out.println(b);
        byte c = 30;
        System.out.println(c);
        short s = 480;
        System.out.println(s);
        int w = (a + b + c);
        System.out.println(w);
        int r = (s / w );
        System.out.println("На каждого ученика рассчитано " + r + " листов бумагию");
    }

    public static void task9() {
        System.out.println("Задание 9");
        byte a = 16;
        System.out.println("За 2 минуты производится " + a + " бутылокю.");
        int b = (a * 10);
        System.out.println("За 20 минут машина производит" + b + " бутылок.");
        int с = (a * 720);
        System.out.println("За сутки машина производит " + с + " бутылок.");
        int s = (a * 2160);
        System.out.println("За 3 дня машина производит " + s + " булыток.");
        int f = (a * 21600);
        System.out.println("За 30 дней машина производит " + f + " бутылок.");
    }

    public static void task10() {
        System.out.println("Задание 10");
        byte a = 120;
        byte b = (4 + 2);
        System.out.println("Всего " + b + " банок краски уходит на один класс.");
        int с = (a / b);
        System.out.println("Всего покрасили " + с + " классов.");
        int s = (4 * 20);
        System.out.println("Столько потребуется " + s + " банок коричневой краски");
        int f = (2 * 20);
        System.out.println("Столько потребуется " + f + " банок белок краски");
        System.out.println("В школе, где " + с + " классов, нужно " + f + " банок белой краски и " + s + " банок коричневой краски");
    }

    public static void task11() {
        System.out.println("Задание 11");
        int bananas = (5 * 80);
        System.out.println(bananas + " вес 5 бананов в граммах");
        int milk = (105 * 2);
        System.out.println(milk + " вес 200 мл молока в граммах");
        int iceCream = (100 * 2);
        System.out.println(iceCream + " вес 2 брикетов мороженного в граммах");
        int eggs = (70 * 4);
        System.out.println(eggs + " вес 4 яиц в граммах");
        int a = (bananas + milk + iceCream + eggs);
        System.out.println(a + " Общий вес всех ингридиентов");
        int b = a / 1000;
        System.out.println(b + " кг");
    }
}








// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println (dog);
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
        System.out.println( "Общий вес бойцов " + totalWeight + "кг!");
        var cutterWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница веса между бойцов " +cutterWeight + "кг!");
        var differenceWeight = totalWeight % cutterWeight;
        System.out.println(differenceWeight);
    }

    public static void task5() {
        System.out.println("Задание 5");
        var numberOfHours = 640;
        System.out.println(numberOfHours);
        var worher = 8;
        System.out.println(worher);
        var totalEmployees1 = ( "Всего работников в первой компании " + (numberOfHours / worher) + " человек.");
        System.out.println(totalEmployees1);
        var totalEmployees2 = 80 + 94;
        System.out.println("Во второй компании работает " + totalEmployees2 + " человек.");
        var totalHours = totalEmployees2 * 8;
        System.out.println("Если в компании работает " + totalEmployees2 + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками.");

    }


    }
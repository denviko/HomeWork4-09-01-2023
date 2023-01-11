public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }

    public static void Task1() {
        System.out.println("Задача №1");
        int age = 35;
        if (age >= 18) {
            System.out.println(("Если возраст человека равен ") + age + (" то он совершеннолетний."));
        }
        if (age < 18) {
            System.out.println(("Если возраст человека равен ") + age + (" он не достиг совершеннолетия, нужно немного подождать."));
        }
    }

    public static void Task2() {
        System.out.println("Задача №2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println(("На улице ") + temperature + (" градусов, нужно надеть шапку."));
        }
        if (temperature >= 5) {
            System.out.println(("На улице ") + temperature + (" градусов, можно идти без шапки."));
        }
    }

    public static void Task3() {
        System.out.println("Задача №3");
        int speed = 65;
        if (speed <= 60) {
            System.out.println(("Если скорость ") + speed + (" км/ч то можно ездить спокойно."));
        }
        if (speed > 60) {
            System.out.println(("Если скорость ") + speed + (" км/ч то придется заплатить штраф."));
        }
    }

    public static void Task4() {
        System.out.println("Задача №4");
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println(("Если возраст человека равен ") + age + (" то ему нужно ходить в детский сад."));
        }
        if (age > 7 && age < 18) {
            System.out.println(("Если возраст человека равен ") + age + (" то ему нужно ходить в школу."));
        }
        if (age >= 18 && age < 24) {
            System.out.println(("Если возраст человека равен ") + age + (" то ему нужно ходить в университет."));
        } else {
            System.out.println(("Если возраст человека равен ") + age + (" то ему пора ходить на работу."));
        }
    }

    public static void Task5() {
        System.out.println("Задача №5");
        int age = 15;
        if (age <= 4) {
            System.out.println(("Если возраст ребенка равен ") + age + (" то ему нельзя кататься на аттракционе."));
        }
        if (age > 5 && age < 13) {
            System.out.println(("Если возраст ребенка равен ") + age + (" то ему можно кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя."));
        } else {
            System.out.println(("Если возраст ребенка равен ") + age + (" то ему можно кататься на аттракционе без сопровождения взрослого"));

        }
    }

    public static void Task6() {
        System.out.println("Задача №6");
        int passengers = 61;
        int seats = 60;
        int capacity = 102;
        if (passengers > capacity) {
            System.out.println("В вагоне мест нет");
        } else {
            if (passengers <= seats) {
                System.out.println("В вагоне есть сидячее место");
            } else {
                System.out.println("В вагоне есть стоячее место");
            }

        }
    }

    public static void Task7() {
        System.out.println("Задача №7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean oneLessTwo = one < two;
        if (oneLessTwo) {
            System.out.println(("Первое число ") + one + (" меньше второго числа " ) + two);
        } else {
                System.out.println(("Второе число ") +two+ ("больше первого числа ") +one);
        }
        boolean twoLessThree = two < three;
        if (twoLessThree) {
            System.out.println(("Второе число ") + two + (" меньше третьего числа ") + three);
        } else {
            System.out.println(("Третье число ") + three + (" больще второго числа ") + two);
        }
        boolean threeHigherOne = three > one;
        if (threeHigherOne) {
            System.out.println(("Третье число ") + three + (" больше первого числа ") + one);
        } else {
            System.out.println(("Первое число ") + one + (" меньше третьего числа ") + three);
        }
        boolean threeHigherTwo = three > two;
        if (threeHigherTwo) {
            System.out.println(("Третье число ") + three + (" больше второго числа ") + two);

        }


        }
    }


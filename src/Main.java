//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // задача 1
        System.out.println(" Задача № 1 ");

        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия нужно немного подождать");
        }

        // задача 2
        System.out.println(" Задача № 2 ");

        byte temperature = 20;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        }

        // задача 3
        System.out.println(" Задача № 3 ");

        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        int speed1 = 80;
        if (speed1 == 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость 60 , то можно ездить спокойно");
        }


        // задача 4
        System.out.println(" Задача № 4 ");

        int personAge = 25;
        if (personAge >= 2 && personAge < 6) {
            System.out.println("Если возраст человека равен " + personAge + " лет , то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge < 17) {
            System.out.println("Если возраст человека равен " + personAge + " лет , то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + " лет , то ему нужно ходить в университет");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + " лет , то ему нужно ходить на работу");
        }

        // задача 5
        System.out.println(" Задача № 5 ");

        byte childsAge = 3;
        if (childsAge < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge + " года, то он не может кататься на атракционе");
        } else {
            System.out.println(" Если возраст ребенка больше 5 лет, то он может кататься на атракционе в сопровождении взрослого");
        }
        byte childsAge1 = 14;
        if (childsAge1 >= 5 && childsAge1 <= 14) {
            System.out.println("Если возраст ребенка равен " + childsAge1 + " лет, то он может кататься на атракционе в сопровождении взрослого");
        } else {
            System.out.println(" Если возраст ребенка больше 14 лет, то он может кататься на атракционе без сопровождения взрослого");
        }
        byte childsAge2 = 16;
        if (childsAge2 > 14) {
            System.out.println("Если возраст ребенка равен " + childsAge2 + " лет, то он может кататься на атракционе без сопровождении взрослого");
        }

        //задача 6
        System.out.println(" Задача № 6 ");

        int fullCarriage = 102; // всего колличество мест в вагоне
        int seating = 60; // всего сидячих мест
        int numberOfPassengers = 0; // колличество пассажиров

        if (numberOfPassengers < seating) {
            System.out.println("Есть места в вагоне сидячие ");
        } else if (numberOfPassengers >= seating && numberOfPassengers < fullCarriage) {
            System.out.println("Есть места в вагоне стоячие");
        } else {
            System.out.println("Вагон уже полностью забит ");
        }
        // задача 7
        System.out.println(" Задача № 7 ");

        int one = 10;
        int two = 21;
        int three = 41;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }


}
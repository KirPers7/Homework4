public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        short age = 18;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println();

        //Задача 2
        System.out.println("Задача 2");

        short temperatureOutside = 6;

        if (temperatureOutside < 5) {
            System.out.println("На улице " + temperatureOutside + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureOutside + " градусов, можно идти без шапки");
        }

        System.out.println();

        //Задача 3
        System.out.println("Задача 3");

        short speedLimit = 60;
        short realSpeed = 61;

        if (realSpeed > speedLimit) {
            System.out.println("Если скорость " + realSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + realSpeed + ", то можно ездить спокойно");
        }

        System.out.println();

        //Задача 4
        System.out.println("Задача 4");

        short personAge = 25;

        if (personAge >= 2 && personAge < 7) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge < 18) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу");
        }

        System.out.println();

        //Задача 5
        System.out.println("Задача 5");

        byte childAge = 15;

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на атракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println();

        //Задача 6
        System.out.println("Задача 6");

        short carriageCapacity = 102;
        short seatingPlaces = 60;

        short passengersCount = 102;

        if (passengersCount < seatingPlaces) {
            System.out.println("В вагоне есть свободные стоячие и сидячие места");
        } else if (passengersCount >= seatingPlaces && passengersCount < carriageCapacity) {
            System.out.println("В вагоне свободны только стоячие места");
        } else if (passengersCount == carriageCapacity) {
            System.out.println("В вагоне нет свободных мест");
        }

        System.out.println();

        //Задача 7
        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one + " больше, чем " + two + " и " + three);
        } else if (two > three && two > one) {
            System.out.println(two + " больше, чем " + one + " и " + three);
        } else if (three > one && three > two) {
            System.out.println(three + " больше, чем " + two + " и " + one);
        }
    }
}
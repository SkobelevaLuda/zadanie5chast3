public class Main {
    public static void main(String[] args) {
        // Задание 1

        System.out.println(" Задание 1 ");

        int age = 16;
        if (age >= 2 && age <= 6) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в детский сад! ");
        } else if (age > 6 && age <= 18) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в школу !");
        } else if (age > 18 && age <= 24) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в университет !");
        } else if (age > 24) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить на работу !");
        }

            // Задание 2.
            System.out.println("Задание 2");
            if (age < 5 ) {
                System.out.println(" Ребенку нельзя кататься на отракционе! ");
            }
            else if (age >= 5 && age < 14) {
                System.out.println(" Ребенку можно кататься в сопровождении взрослого, если взрослого нет, то нельзя! ");
            }
            if (age >= 14) {
                System.out.println(" Ребенок может кататься без сопровождения ");
            }
            // Задание 3
            System.out.println(" Задание 3 ");

            int one = 102;
            int two = 200;
            int three = 300;
            if (one> two){
                if (one>three) {
                    System.out.println(" Максимальное число" + one);
                }else if (three> one){
                    System.out.println(" Максимальное число " + three);
                }else {
                    System.out.println(" Числа " + one + " и " + three + " равны ");
                }
            }else if (two>one) {
                if (two > three) {
                    System.out.println(" Максимальное число " + two);
                } else if (three > two) {
                    System.out.println(" Максимальное число " + three);
                } else {
                    System.out.println(" Числа" + two + " и " + three + " равны");
                }
            }else {
                if ( one>three) {
                    System.out.println(" Максимальное число" + one);
                } else if (three>one) {
                    System.out.println(" Максимальное число " + three);
                }else {
                    System.out.println(" Все числа равны ");
                }
            }



        }
    }

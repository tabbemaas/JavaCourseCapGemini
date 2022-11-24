// datatypes exercise
import authentication.Person;
import authentication.Door;

public class Main {
        // 1
//    public static void main(String[] args) {
//        System.out.println("Hello world");

        // 2
//        public static void main(String[] args) {
//            int number = 8;
//            int number2 = 20;
//            int result = number*number2;
//            System.out.println(result);

        // 3
//        public static void main(String[] args) {
//            String name = "Tabbe";
//            System.out.println(name);
//            int age = 28;
//            System.out.println("Hi, I am " + name + " and i am " + age);

        // 4
//        public static void main(String[] args) {
//            boolean test = false;
//            System.out.println(test);
//            test = true;
//            System.out.println(test);
//            test = !test;
//            System.out.println(test);

        // 5
//          public static void main(String[] args) {
//              int result = multiply(8, 20);
//              System.out.println(result);
//        }
//
//        public static int multiply(int number1, int number2) {
//            int result = number1*number2;
//            return result;
//        }

        //6
//        public static void main(String[] args) {
//                Person tabbe = new Person("Tabbe", 28);
//                Person maud = new Person("Maud", 27);
//                System.out.println("Hi, my name is " + tabbe.getName() + " and I am " + tabbe.getAge());
//                System.out.println("Hi, my name is " + maud.getName() + " and I am " + maud.getAge());
//        }

        //7
        public static void main(String[] args) {
                Door door1 = new Door(20,30,false);
                door1.openDoor();
                door1.closeDoor();
                door1.printOpen();
                int result = door1.calculateSurface();
                System.out.println(result);
        }
}

package rust.kurganov;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        double c = 1.2;

        int maxInt=2147483647;
        int minInt=-2147483648;

        System.out.println("Calc");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        System.out.println("Calc2");
        System.out.println(a + " = " + b + " " + (a==b));
        System.out.println(a + " < " + b + " " + (a<b));
        System.out.println(a + " > (" + b + "-1) " + (a>(b-1)));
        System.out.println(a + " => (" + b + "+77) " + (a>=(b+77)));
        System.out.println(a + " <= (" + b + "*10) " + (a<=(b*10)));

        System.out.println("Overflow");
        System.out.println("Max int + 1 = Min int = " + (maxInt + 1));
        System.out.println("Min int - 1 = Max int = " + (minInt + (-1)));

        System.out.println("Type combinations");
        System.out.println(a + " with type int + " + c +" with type double = " + (a + c));

        int timeHour = 19;
        int timeMinute = 59;
        String dayWeekMonday = "Понедельник";
        String dayWeekThursday = "Четверг";


    }
}


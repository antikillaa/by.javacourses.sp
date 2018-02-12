package by.javacourse.sp.math;

public class math {


    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        System.out.println(x);
        int y = (int) (Math.random() * 10);
        System.out.println(y);
        int z;

        z = x + y;
        System.out.println("Result of x + y = " + z);

        z = x - y;
        System.out.println("Result of x - y = " + z);

        z = x / y;
        System.out.println("Result of x / y = " + z);

        z = x * y;
        System.out.println("Result of x * y = " + z);

    }

}

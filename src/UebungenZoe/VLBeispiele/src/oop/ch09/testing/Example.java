package oop.ch09.testing;

public class Example {
    /**
     * Counts zeroes in an array.
     *
     * @param x array to count zeroes in
     * @return number of occurrences of 0 in x
     * @throws NullPointerException if x is null
     */
    public static int numZero(int[] x) {
        int count = 0;
        for (int i = 1; i < x.length; i++)
            if (x[i] == 0)
                count++;
        return count;
    }

    public static int numZero2(int[] x) {
        int count = 0;
        int i = 1;
        while (i < x.length) {
            if (x[i] == 0)
                count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int g = 5 / 0;
        check(2, 7, 0);
        check(0, 7, 2);
    }

    private static void check(int... x) {
        System.out.print("zeroes in [");
        boolean first = true;
        for (int v : x) {
            if (!first) System.out.print(", ");
            first = false;
            System.out.print(v);
        }
        System.out.println("]: " + numZero2(x));
    }
}

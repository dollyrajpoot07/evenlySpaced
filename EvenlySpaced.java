// evenlySpaced

// Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
// evenlySpaced(2, 4, 6) → true
// evenlySpaced(4, 6, 2) → true
// evenlySpaced(4, 6, 3) → false

import java.util.*;

public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
        int diff1 = 0;
        int diff2 = 0;
        int diff3 = 0;
        if (a == b && a == c)
            return true;
        if (a == b || b == c || a == c)
            return false;
        diff1 = Math.abs(a - b);
        diff2 = Math.abs(a - c);
        diff3 = Math.abs(b - c);
        if (diff1 == diff2)
            return true;
        if (diff1 == diff3)
            return true;
        if (diff2 == diff3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        boolean spacedEvenly = evenlySpaced(a, b, c);
        System.out.println("Spaced Evenly: " + spacedEvenly);
        sc.close();
    }

}

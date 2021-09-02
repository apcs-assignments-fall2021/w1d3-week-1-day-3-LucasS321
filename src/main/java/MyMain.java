public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        // REPLACE THIS WITH YOUR CODE
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin() {
        // REPLACE THIS WITH YOUR CODE
        double rnd = Math.random();
        if (rnd > 0.5) {
            return true;
        }
        return false;
    }

    // This method simulates the flip of a weighted coin,
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        double rnd = Math.random();
        if (rnd > 0.3) {
            return true;
        }
        // REPLACE THIS WITH YOUR CODE
        return false;
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        if ((d  % 1) > 0.5) {
            return (int) (d - (d % 1) + 1);
        } else {
            return (int) (d - (d % 1));
        }
        // REPLACE THIS WITH YOUR CODE
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        double rnd = Math.random()*1.2;
        if (rnd < 0.2) {
            return 1;
        } else if (rnd < 0.4) {
            return 2;
        } else if (rnd < 0.6) {
            return 3;
        } else if (rnd < 0.8) {
            return 4;
        } else if (rnd < 1) {
            return 5;
        } else {
            return 6;
        }
    }

    // This method carries out the quadratic formula and *prints* out the answers
    public static void quadForm(int a, int b, int c) {
        double o = Math.sqrt(b^2-4*a*c);
        double first = (-b + o)/(2*a);
        double second = (-b - o)/(2*a);//dfas
        System.out.println("x="+first+" x="+second);
    }

    public static void main(String[] args) {
        // Test the add5 method
        int x = 2;
        int y = add5(x);
        quadForm(23,5,-2);

        // YOUR CODE HERE
    }
}
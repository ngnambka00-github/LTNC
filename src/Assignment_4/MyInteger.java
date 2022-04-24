package Assignment_4;

public class MyInteger {
    private int value = 0;
    public MyInteger() { value = 0; }
    public MyInteger(int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
    public boolean isEven() { return value % 2 == 0; }
    public boolean isOdd() { return value % 2 == 1; }
    public boolean isPrime() {
        if (value <= 1) return false;

        if (value > 1 && value <= 3) return true;
        for (int i = 2; i <= Math.sqrt(value); i++)
            if (value % i == 0) return false;

        return true;
    }

    public static boolean isEven(int newValue) { return newValue % 2 == 0; }
    public static boolean isOdd(int newValue) { return newValue % 2 == 1; }
    public static boolean isPrime(int newValue) {
        if (newValue <= 1) return false;

        if (newValue > 1 && newValue <= 3) return true;

        for (int i = 2; i <= Math.sqrt(newValue); i++)
            if (newValue % i == 0) return false;

        return true;
    }

    public boolean equals(MyInteger myInt) {
        return value == myInt.getValue();
    }

    public boolean equals(int myInt) {
        return value == myInt;
    }

    public static int parseInt(char[] charArr) {
        String temp = new String(charArr);
        return (int)Integer.parseInt(temp);
    }

    public static int parseInt(String numStr) {
        return (int) Integer.parseInt(numStr);
    }
}

class Prime {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        else if (n == 2)
            return true;

        else if (n % 2 == 0)
            return false;
        if (n % i == 0)
            return false;
    }

    public static void main(String[] args) {
        if (isPrime(19))
            System.out.println("true");

        else
            System.out.println("false");
    }
}
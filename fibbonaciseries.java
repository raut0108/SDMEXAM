class fibbonaciseries {

    public static int Fibbo(int no) {
        if (no <= 1)
            return no;
        return Fibbo(no - 1) + Fibbo(no - 2);
    }

    public static void main(String args[]) {
        int n = 20;
        for (int i = 1; i <= n; i++)
            System.out.println(Fibbo(i));

    }

}

public class PollardsRho {

    public static int f(int x, int n) {
        return (int) ((Math.pow(x, 2) + 5) % n);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int n = 1359331;
        int a = 1, b = 1, d = 1, i = 0;

        while (d == 1) {
            a = f(a, n);
            b = f(f(b, n), n);
            d = gcd(Math.abs(a - b), n);
            System.out.println("Итерация " + (i + 1) + " a = " + a + " b = " + b + " d = " + d);
            i++;
        }

        if (d == n) {
            System.out.println("Делитель не найден");
        } else {
            System.out.println("Нетривиальный делитель числа " + n + " равен " + d);
        }
    }
}
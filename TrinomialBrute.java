public class TrinomialBrute {
    // Recursive brute-force computation
    public static int trinomial(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (Math.abs(k) > n) return 0;
        return trinomial(n - 1, k - 1) + trinomial(n - 1, k) + trinomial(n - 1, k + 1);
    }

    public static void main(String[] args) {
        int n = 5;  // Example
        int k = 2;
        System.out.println("T(" + n + ", " + k + ") = " + trinomial(n, k));
    }
}

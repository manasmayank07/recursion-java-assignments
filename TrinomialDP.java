public class TrinomialDP {
    private static int[][] memo;

    public static int trinomial(int n, int k) {
        memo = new int[n + 1][2 * n + 1];
        return trinomialDP(n, k + n);
    }

    private static int trinomialDP(int n, int k) {
        if (n == 0 && k == memo.length / 2) return 1;
        if (k < 0 || k >= memo[0].length || n < 0) return 0;
        if (memo[n][k] != 0) return memo[n][k];
        memo[n][k] = trinomialDP(n - 1, k - 1) + trinomialDP(n - 1, k) + trinomialDP(n - 1, k + 1);
        return memo[n][k];
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("T(" + n + ", " + k + ") = " + trinomial(n, k));
    }
}

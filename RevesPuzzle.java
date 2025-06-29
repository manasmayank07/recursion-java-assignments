public class RevesPuzzle {
    public static void reves(int n, String from, String temp1, String temp2, String to) {
        if (n == 0) return;
        int k = n - (int) Math.round(Math.sqrt(2 * n + 1)) + 1;

        reves(k, from, to, temp2, temp1);
        hanoi(n - k, from, temp2, to);
        reves(k, temp1, from, temp2, to);
    }

    public static void hanoi(int n, String from, String temp, String to) {
        if (n == 0) return;
        hanoi(n - 1, from, to, temp);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        hanoi(n - 1, temp, from, to);
    }

    public static void main(String[] args) {
        int n = 4; // Number of disks
        reves(n, "A", "B", "C", "D");
    }
}

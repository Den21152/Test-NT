public class Main {
    public static void main(String[] args) {
        System.out.println("Argument count: " + args.length);

        int n;
        for(n = 0; n < args.length; ++n) {
            System.out.println("Argument " + n + ": " + args[n]);
        }

        n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[] array = new int[n];

        int current;
        for(current = 0; current < n; ++current) {
            array[current] = current + 1;
        }

        current = 1;
        System.out.print("Полученный путь: ");

        do {
            System.out.print(current);
            current = (current + m - 2) % n + 1;
        } while(current != 1);
    }
}



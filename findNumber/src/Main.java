public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};

        int lookFor = 6;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == lookFor) {
                isThere = true;
                break;
            }

        }
        if (isThere) {
            System.out.println("Sayı mevcuttur.");
        } else
            System.out.println("Sayı mevcut değldir.");
    }
}
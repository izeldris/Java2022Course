public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};

        int lookFor = 6;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == lookFor) {
                isThere = true;
                break;
            }

        }
        String message = "";
        if (isThere) {
            message = "Sayı mevcuttur: " + lookFor;
        } else
            sendMessage("Sayı mevcut değildir: " + lookFor);
    }

    public static void sendMessage(String message) {
        System.out.println(message);
    }
}
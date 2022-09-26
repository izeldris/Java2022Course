public class Main {
    public static void main(String[] args) {

        char letter = 'A';

        switch(letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Harfimiz Kalın Seslidir.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Harfimiz İnce Seslidir");
                break;
            default:
                System.out.println("Yanlış Girdi.");

        }


    }
}
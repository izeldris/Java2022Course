public class Main {
    public static void main(String[] args) {
        String message= "Bugün hava çok güzel.";
        String newMessage = sendCity();
        System.out.println(newMessage);
        int number = sum(5,7);
        System.out.println(number);
    }
    public static void add(){
        System.out.println("Eklendi");
    }
    public static void delete(){
        System.out.println("Silindi");
    }
    public static void update(){
        System.out.println("Güncellendi");
    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static String sendCity(){
        return "Ankara";
    }
}
public class Main {
    public static void main(String[] args) {
        int num1=20;
        int num2=25;
        int num3=5;
        int numBig = num1;
        if (numBig<num2){
            numBig=num2;
        }
        if (numBig<num3){
            numBig = num3;
        }

        System.out.println("En Büyük Sayı = " + numBig);
    }
}
public class Main{
    public static void main(String[] args) {
        String std1 = "Engin";
        String std2 = "Derin";
        String std3 = "Salih";
        String std4 = "Ahmet";

        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
        System.out.println(std4);

        System.out.println("----------------------------------------------");

        String[] students  = new String[3];
        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";

        for(int i =0;i<students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("----------------------------------------------");



        for(String student:students){
            System.out.println(student);
        }
    }
}
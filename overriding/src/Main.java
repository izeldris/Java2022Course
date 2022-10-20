public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new StudentCreditManager(),new TeacherCreditManager(),new AgricultureCreditManager()};
        for (BaseCreditManager creditManager:creditManagers) {
            System.out.println(creditManager.calc(15000));

        }
    }
}

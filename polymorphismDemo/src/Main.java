public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DbLogger(), new ConsoleLogger()};
//        for (BaseLogger logger:loggers) {
//            logger.log("Log Message");
//    }
        CustomerManager customerManager = new CustomerManager(new DbLogger());
        customerManager.add();

        }
    }

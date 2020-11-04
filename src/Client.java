public class Client {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        PhoneNotification phoneNotification = new PhoneNotification();
        AppNotification appNotification = new AppNotification();

        Account hoang = new Account();
        hoang.attach(emailNotification);
        hoang.attach(phoneNotification);

        hoang.notification("Hoang chuyen tien cho Duy 500$");
        hoang.detach(phoneNotification);
        hoang.attach(appNotification);
        hoang.notification("Hoang chuyen tien cho Khien 100$");
    }
}

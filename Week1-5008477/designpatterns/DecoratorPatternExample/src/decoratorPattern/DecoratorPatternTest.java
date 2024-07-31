package decoratorPattern;
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Basic email notification
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello via Email!");

        System.out.println();

        // Email and SMS notification
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        smsNotifier.send("Hello via Email and SMS!");

        System.out.println();

        // Email, SMS, and Slack notification
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        slackNotifier.send("Hello via Email, SMS, and Slack!");
    }
}


package Java06.ex02;

public class ExtendingResponsibilityTest {
    public static void main(String[] args) {
        Notifier basicNotifier = new Notifier();
        basicNotifier.send("Hello!");

        Notifier decoratorNotifier = new NotifierDecorator (basicNotifier);
        decoratorNotifier.send("Hello");

        Notifier verboseNotifier = new VerboseNotifier();
        VerboseNotifier.send("Hello!");
    }
}
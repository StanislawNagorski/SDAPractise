package HomeTasks0507.designPatterns.Obserwator.Listeners;

import HomeTasks0507.designPatterns.Obserwator.Listeners.Listener;

public class SMSender implements Listener {
    @Override
    public void upDate() {
        System.out.println("Pan Tadeusz wysłany sms na podany numer uzytkowniaka");
    }
}

package HomeTasks0507.designPatterns.Obserwator;

import HomeTasks0507.designPatterns.Obserwator.Listeners.*;

public class App {

    public static void main(String[] args) {

        MockButton mockButton = new MockButton();
        mockButton.addListener(new SMSender());
        mockButton.addListener(new TextScreamer());
        mockButton.addListener(new PiwkoOrderer());

        mockButton.click();

    }
}

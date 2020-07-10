package HomeTasks0507.designPatterns.Singelton;

import java.io.*;

public class SingletonLogger {

    public static final SingletonLogger INSTANCE = new SingletonLogger();

    private File file;
    private PrintWriter printWriter;

    private SingletonLogger() {

        file = new File("src/main/java/HomeTasks0507/designPatterns/Singelton/logs.txt");
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton może być tylko jeden");
        }
    }


    public void log(String logs) {
        printWriter.println(logs);
    }

    public void closeLogs() {
        printWriter.close();
    }


    public static void main(String[] args) throws IOException {

        SingletonLogger.INSTANCE.log("Uno!");
        SingletonLogger.INSTANCE.log("Duo!");
        SingletonLogger.INSTANCE.log("Tres!");
        SingletonLogger.INSTANCE.closeLogs();

        //TODO dlaczego nie następuje zapis do pliku, kiedy wywołuję konstruktor?
        //SingletonLogger singletonLogger = new SingletonLogger();
    }

}


//Singleton -->
//
//        Zaimplementować klasę Logger która:
//        - Będzie singletonem
//        - Powinna zawierać metodę log, która jako argument przyjmuje test (String) oraz zapisuje go do pliku.
//        - Sciezna do pliku powinna byc stała z góry ustalona

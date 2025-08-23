package Advance;import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Logger {
    private final String logFile = "app.log";
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public void log(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = "[" + timestamp + "] " + message;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(logEntry);
            writer.newLine();
            System.out.println(" Logged: " + logEntry);
        } catch (IOException e) {
            System.out.println(" Error writing log: " + e.getMessage());
        }
    }
}

public class LogSystem {
    public static void main(String[] args) {
        Logger logger = new Logger();


        logger.log("Application started");
        logger.log("User logged in");
        logger.log("An error occurred while processing request");
        logger.log("Application terminated");
    }
}

public class LogLevels {
    public static String message(String logLine) {
        int index = logLine.indexOf("]");

        return logLine.substring(index + 2).trim();
    }

    public static String logLevel(String logLine) {
        int firstIndex = logLine.indexOf("[");
        int secondindex = logLine.indexOf("]");
        return logLine.substring(firstIndex + 1, secondindex).toLowerCase();
    }

    public static String reformat(String logLine) {
        String logLevel = logLine.substring(logLine.indexOf("["), logLine.indexOf(":"));

        logLevel = logLevel.toLowerCase();
        logLevel = logLevel.replace("[", "(");
        logLevel = logLevel.replace("]", ")");

        String message = logLine.substring(logLine.indexOf(":") + 1).trim();

        return message + " " + logLevel;
    }
}

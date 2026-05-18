public class LogLevels {
    
    public static String message(String logLine) {

        int startIndex = logLine.indexOf(":");
        String logMessage = logLine.substring(startIndex +1);

        return logMessage.trim();
        
    }

    public static String logLevel(String logLine) {

        int start = logLine.indexOf("[") +1;
        int end = logLine.indexOf("]");
        
        String logLevel = logLine.substring(start, end);

        return logLevel.toLowerCase();
    }

    public static String reformat(String logLine) {

        String logLineMessage = logLine.substring(logLine.indexOf(":") +1).trim();
        String logLineLevel = logLine.substring(logLine.indexOf("[") +1, logLine.indexOf("]")).toLowerCase();
        

        return logLineMessage + " (" + logLineLevel + ")";
    }
}

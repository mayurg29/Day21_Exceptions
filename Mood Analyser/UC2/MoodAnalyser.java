public class MoodAnalyser {

    public String analyseMood(String message) {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException exception) {
            return "HAPPY";
        }
    }
}

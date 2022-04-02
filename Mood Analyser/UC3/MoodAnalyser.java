public class MoodAnalyser {

    public String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY,
                                                "Please enter proper message");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException exception) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,
                                            "Please enter proper message");
        }
    }
}

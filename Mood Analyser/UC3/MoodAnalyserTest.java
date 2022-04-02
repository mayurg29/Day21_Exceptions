import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in happy mood");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMood_IfNull_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenMood_IfEmpty_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood("");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY, e.type);
        }
    }
}
package Event;
import java.util.EventObject;

public class ScoreEvent extends EventObject {
    private String scoreLine;

    public ScoreEvent(Object source, String scoreLine) {
        super(source);
        this.scoreLine = scoreLine;
    }

    public String getScoreLine() {
        return scoreLine;
    }
}
package BoundProperties;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LiveScoreBean {
    public static final String PROP_SCORE_LINE = "scoreLine";
    private String scoreLine;
    private final PropertyChangeSupport support;

    public LiveScoreBean() {
        support = new PropertyChangeSupport(this);
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String newScore) {
        String oldScore = this.scoreLine;
        this.scoreLine = newScore;
        // แจ้งเตือนการเปลี่ยนแปลงค่าของ property "scoreLine"
        support.firePropertyChange(PROP_SCORE_LINE, oldScore, newScore);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
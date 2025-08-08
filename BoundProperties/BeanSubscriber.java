package BoundProperties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BeanSubscriber implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // รับค่าใหม่จาก event และแสดงผล
        System.out.println("live result: " + evt.getNewValue());
    }
}

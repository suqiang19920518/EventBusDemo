package material.danny_jiang.com.eventbusdemo;

import android.support.v4.app.Fragment;

/**
 * Created by axing on 16/10/25.
 */

public class FragmentEvent {

    public FragmentEvent() {

    }

    public FragmentEvent(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    private int position;
}

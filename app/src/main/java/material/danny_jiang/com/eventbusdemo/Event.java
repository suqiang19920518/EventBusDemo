package material.danny_jiang.com.eventbusdemo;

/**
 * Created by axing on 16/10/25.
 */

public class Event {

    private String body;

    public Event() {

    }

    public Event(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

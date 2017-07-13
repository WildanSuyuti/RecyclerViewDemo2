package id.co.firzil.recyclerviewdemo;

/**
 * Created by kakaroto on 13/07/17.
 */

public class Inbox {
    private String name, message, time;

    public Inbox(String name, String message, String time) {
        this.name = name;
        this.message = message;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}

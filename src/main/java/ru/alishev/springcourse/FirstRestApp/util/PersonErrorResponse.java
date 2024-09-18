package ru.alishev.springcourse.FirstRestApp.util;

public class PersonErrorResponse {
    private String message;
    private long timestamp; // будем указывать в миллисекундах отметку времени, когда произ ошибка

    public PersonErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

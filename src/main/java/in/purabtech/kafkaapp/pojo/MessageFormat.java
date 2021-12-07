package in.purabtech.kafkaapp.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageFormat {
    private final String message;
    private final int identifier;

    public MessageFormat(@JsonProperty("message") final String message,
                         @JsonProperty("identifier") final int identifier) {
        this.message = message;
        this.identifier = identifier;
    }

    public String getMessage() {
        return message;
    }

    public int getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "PracticalAdvice::toString() {" +
                "message='" + message + '\'' +
                ", identifier=" + identifier +
                '}';
    }
}

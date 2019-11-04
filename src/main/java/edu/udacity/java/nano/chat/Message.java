package edu.udacity.java.nano.chat;

/**
 * WebSocket message model
 */
public class Message {
    // TODO: add message model.
    private String username;
    private String message;
    private String type;
    private String onlineCount;


        //define other constructors
        //define getters and setters
    public String getUsername() {
        return this.username;
    }

    public void setUsername (String newUsername) {
        this.username = newUsername;
    }


    public String getMessage() {
        return this.message;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    public String getType() {
        return this.type;
    }

    public void setType (String type) {
        this.type = type;
    }


    public String getOnlineCount() {
        return this.onlineCount;
    }

    public void setOnlineCount (String onlineCount) {
        this.onlineCount = onlineCount;
    }

}




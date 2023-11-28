package org.example.models;

public class Player {
    private User user;
    private Status status;
    private int position;

    public Player(User user) {
        this.user = user;
        this.status = Status.PLAYING;
        position = 0;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

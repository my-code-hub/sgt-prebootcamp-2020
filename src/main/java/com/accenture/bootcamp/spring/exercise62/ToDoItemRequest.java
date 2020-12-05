package com.accenture.bootcamp.spring.exercise62;

public class ToDoItemRequest {

    private String title;
    private boolean complete;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}

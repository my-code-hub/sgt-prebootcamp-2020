package com.accenture.bootcamp.spring.exercise62;

import java.time.LocalDateTime;

public class ToDoItemRequest {
    private String title;
    private boolean complete;
    private LocalDateTime created;

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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}

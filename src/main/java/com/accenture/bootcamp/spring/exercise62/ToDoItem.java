package com.accenture.bootcamp.spring.exercise62;

import java.time.LocalDateTime;
import java.util.Objects;

public class ToDoItem {
    private Long id;
    private String title;
    private boolean complete;
    private LocalDateTime created;

    public ToDoItem() {
    }

    public ToDoItem(Long id, String title, boolean complete) {
        this.id = id;
        this.title = title;
        this.complete = complete;
    }

    public ToDoItem(ToDoItemRequest request) {
        this.title = request.getTitle();
        this.complete = request.isComplete();
        this.created = request.getCreated();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItem toDoItem = (ToDoItem) o;
        return complete == toDoItem.complete &&
                Objects.equals(id, toDoItem.id) &&
                Objects.equals(title, toDoItem.title) &&
                Objects.equals(created, toDoItem.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, complete, created);
    }
}

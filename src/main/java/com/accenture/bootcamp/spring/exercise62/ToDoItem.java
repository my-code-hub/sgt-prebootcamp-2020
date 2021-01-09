package com.accenture.bootcamp.spring.exercise62;

import java.util.Objects;

public class ToDoItem {
    private Long id;
    private String title;
    private boolean complete;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDoItem)) return false;
        ToDoItem toDoItem = (ToDoItem) o;
        return id == toDoItem.id &&
                complete == toDoItem.complete &&
                Objects.equals(title, toDoItem.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, complete);
    }
}

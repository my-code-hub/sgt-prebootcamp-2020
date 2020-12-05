package com.accenture.bootcamp.spring.exercise62;

import java.util.List;

public interface ToDoItemRepository {

    ToDoItem findOne(long id);

    List<ToDoItem> findAll();

    ToDoItem insert(ToDoItem item);

    ToDoItem update(long id, ToDoItem item);

    void delete(long id);
}

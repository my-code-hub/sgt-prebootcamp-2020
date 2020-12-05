package com.accenture.bootcamp.spring.exercise62;

import java.util.List;

public interface ToDoItemRepository {

    ToDoItem findOne(long id);

    List<ToDoItem> findAll();

    ToDoItem insert(ToDoItemRequest item);

    ToDoItem update(long id, ToDoItemRequest item);

    void delete(long id);
}

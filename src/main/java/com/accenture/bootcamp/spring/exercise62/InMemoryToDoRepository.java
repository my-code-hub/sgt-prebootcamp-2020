package com.accenture.bootcamp.spring.exercise62;

import com.accenture.bootcamp.spring.errors.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

@Component
public class InMemoryToDoRepository implements ToDoItemRepository {

    private final Sequence sequence;
    private final List<ToDoItem> items = new ArrayList<>();

    @Autowired
    public InMemoryToDoRepository(Sequence sequence) {
        this.sequence = sequence;
    }

    @PostConstruct
    public void addExampleToDoItemsOnStartUp() {
        insert("Buy milk", false);
        insert("Go to gym", false);
        insert("Learn programming", true);
    }

    public ToDoItem findOne(long id) {
        ToDoItem item = findById(id);
        if (item == null) {
            throw new NotFoundException("ToDo item with id " + id + " doesn't exist");
        }
        return item;
    }

    public List<ToDoItem> findAll() {
        return items;
    }

    public ToDoItem insert(ToDoItemRequest request) {
        ToDoItem item = new ToDoItem(request);
        item.setId(sequence.next());
        items.add(item);
        return item;
    }

    public ToDoItem update(long id, ToDoItemRequest item) {
        ToDoItem existing = findOne(id);
        existing.setTitle(item.getTitle());
        existing.setComplete(item.isComplete());
        return existing;
    }

    public void delete(long id) {
        items.remove(findOne(id));
    }

    private ToDoItem findById(long id) {
        for (ToDoItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    private void insert(String title, boolean complete) {
        items.add(new ToDoItem(sequence.next(), title, complete));
    }
}

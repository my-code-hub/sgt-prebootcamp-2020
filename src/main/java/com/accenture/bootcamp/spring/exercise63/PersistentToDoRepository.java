package com.accenture.bootcamp.spring.exercise63;

import com.accenture.bootcamp.spring.errors.NotFoundException;
import com.accenture.bootcamp.spring.exercise62.ToDoItem;
import com.accenture.bootcamp.spring.exercise62.ToDoItemMapper;
import com.accenture.bootcamp.spring.exercise62.ToDoItemRepository;
import com.accenture.bootcamp.spring.exercise62.ToDoItemRequest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Primary
@Component
public class PersistentToDoRepository implements ToDoItemRepository {

    private final ToDoItemMapper mapper;

    public PersistentToDoRepository(ToDoItemMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ToDoItem findOne(long id) {
        ToDoItem item = mapper.findById(id);
        if (item == null) {
            throw new NotFoundException("ToDo item with id " + id + " doesn't exist");
        }
        return item;
    }

    @Override
    public List<ToDoItem> findAll() {
        return mapper.findAll();
    }

    @Override
    public ToDoItem insert(ToDoItemRequest request) {
        ToDoItem item = new ToDoItem(request);
        mapper.insert(item);
        return item;
    }


    @Override
    public ToDoItem update(long id, ToDoItemRequest item) {
        ToDoItem existing = findOne(id);
        existing.setTitle(item.getTitle());
        existing.setComplete(item.isComplete());
        mapper.update(existing);
        return existing;
    }

    @Override
    public void delete(long id) {
        mapper.deleteById(id);
    }
}

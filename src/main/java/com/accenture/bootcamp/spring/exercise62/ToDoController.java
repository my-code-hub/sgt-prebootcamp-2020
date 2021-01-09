package com.accenture.bootcamp.spring.exercise62;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RequestMapping("/todos")
@RestController
public class ToDoController {

    private final ToDoItemRepository repository;
    private final ToDoItemMapper mapper;

    @Autowired
    public ToDoController(ToDoItemRepository repository, ToDoItemMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public ToDoItem findOne(@PathVariable long id) {
        return repository.findOne(id);
    }

    @GetMapping
    public List<ToDoItem> getToDoItems() {
        return repository.findAll();
    }

    @PostMapping
    public ToDoItem create(@RequestBody ToDoItemRequest item) {
        return repository.insert(item);
    }

    @PutMapping("/{id}")
    public ToDoItem update(@PathVariable long id,
                           @RequestBody ToDoItemRequest item) {
        return repository.update(id, item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.delete(id);
    }

    @GetMapping("/test-insert-multiple")
    public List<ToDoItem> testInsertMore() {
        List<ToDoItem> items = asList(
                new ToDoItem(null, "Item 100", false),
                new ToDoItem(null, "Item 101", true)
        );
        mapper.insertMultiple(items);
        return repository.findAll();
    }
}

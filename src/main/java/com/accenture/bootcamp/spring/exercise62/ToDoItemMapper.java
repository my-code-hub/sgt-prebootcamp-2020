package com.accenture.bootcamp.spring.exercise62;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ToDoItemMapper {

    @Select("select id, title, complete from todo_items")
    List<ToDoItem> findAll();

    @Select("select id, title, complete from todo_items where id = #{id}")
    ToDoItem findById(long id);

    @Options(useGeneratedKeys = true,
            keyProperty = "id", // šis ir ToDoItem klases propertija nosaukumus
            keyColumn = "id") //šis ir datubāzes tabulas id kolonnas nosaukums.
    @Insert("insert into todo_items (title, complete) values (#{title}, #{complete})")
    void insert(ToDoItem item);

    @Update("update todo_items set " +
            "title = #{title}, " +
            "complete = #{complete} " +
            "where id = #{id}")
    boolean update(ToDoItem item);

    @Delete("delete from todo_items where id = #{id}")
    boolean deleteById(long id);
}

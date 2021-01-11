package com.accenture.bootcamp.spring.exercise62;

import org.apache.ibatis.annotations.*;

import java.util.List;

//Requires the following table in MySql
//create table todo_items (
//   id int auto_increment PRIMARY KEY,
//   title varchar(255) NOT NULL,
//   complete boolean NOT NULL,
//   created datetime
//);

@Mapper
public interface ToDoItemMapper {

    @Select("select id, title, complete, created from todo_items")
    List<ToDoItem> findAll();

    @Select("select id, title, complete, created from todo_items where id = #{id}")
    ToDoItem findById(long id);

    @Options(useGeneratedKeys = true,
            keyProperty = "id", // šis ir ToDoItem klases propertija nosaukumus
            keyColumn = "id") //šis ir datubāzes tabulas id kolonnas nosaukums.
    @Insert("insert into todo_items (title, complete, created) values (#{title}, #{complete}, #{created})")
    void insert(ToDoItem item);

    @Update("update todo_items set " +
            "title = #{title}, " +
            "complete = #{complete} " +
            "where id = #{id}"
    )
    boolean update(ToDoItem item);

    @Delete("delete from todo_items where id = #{id}")
    boolean deleteById(long id);

    @Insert({
            "<script>" +
                "insert into todo_items (title, complete) values" +
                "<foreach item='toDoItem' collection='items' open='' separator=',' close=''>" +
                "(" +
                    "#{toDoItem.title}," +
                    "#{toDoItem.complete}" +
                ")" +
                "</foreach>" +
            "</script>"})
    void insertMultiple(@Param("items") List<ToDoItem> items);
}

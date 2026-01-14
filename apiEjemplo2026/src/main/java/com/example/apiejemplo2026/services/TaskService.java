package com.example.apiejemplo2026.services;

import com.example.apiejemplo2026.entities.Task;

import java.sql.Struct;
import java.util.List;
import java.util.Optional;

public interface TaskService {

    List<Task> findAll();

    Optional<Task> findById(Long id);
    Optional<Task> findByTitle(String titles);

    Task saveTask(Task task);



    void deleteTask(Long id);
    void deleteall();

}

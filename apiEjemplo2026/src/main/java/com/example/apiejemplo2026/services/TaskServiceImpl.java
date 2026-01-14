package com.example.apiejemplo2026.services;

import com.example.apiejemplo2026.entities.Task;
import com.example.apiejemplo2026.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {

        return taskRepository.findAll();

    }

    @Override
    public Optional<Task> findById(Long id) {

        return taskRepository.findById(id);
    }

    @Override
    public Optional<Task> findByTitle(String titles) {

        return taskRepository.findByTitle(titles);
    }

    @Override
    public Task saveTask(Task task) {

        return taskRepository.save(task);
    }


    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteAll();
    }

    @Override
    public void deleteall() {

    }
}

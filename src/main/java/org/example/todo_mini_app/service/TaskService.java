package org.example.todo_mini_app.service;

import org.example.todo_mini_app.models.Task;
import org.example.todo_mini_app.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false
        );
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id).get();
        if(task.getCompleted().equals(true)) {
            task.setCompleted(false);
        }else  {
            task.setCompleted(true);
        }
        taskRepository.save(task);
    }
}

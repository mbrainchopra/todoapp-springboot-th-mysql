package org.example.todo_mini_app.repository;

import org.example.todo_mini_app.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}

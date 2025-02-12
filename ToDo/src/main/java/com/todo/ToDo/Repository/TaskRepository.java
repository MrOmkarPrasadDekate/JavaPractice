package com.todo.ToDo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.ToDo.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}

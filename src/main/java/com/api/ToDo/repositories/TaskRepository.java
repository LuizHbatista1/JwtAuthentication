package com.api.ToDo.repositories;

import com.api.ToDo.domain.task.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository <Task , Long> {
}

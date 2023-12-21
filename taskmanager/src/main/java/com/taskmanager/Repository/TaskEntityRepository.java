package com.taskmanager.Repository;

import com.taskmanager.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskEntityRepository extends JpaRepository<Task, Integer> {
}

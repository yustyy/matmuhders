package com.matmuh.gun1.dataAccess;


import com.matmuh.gun1.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//dependency injection yapmis olduk
@Repository
public interface TodoDao extends JpaRepository<Todo, Integer> {
}

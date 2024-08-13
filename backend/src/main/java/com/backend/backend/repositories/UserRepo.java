package com.backend.backend.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.backend.models.User;

public interface UserRepo extends JpaRepository<User, Long> {

    @Query(nativeQuery = true, value = """
            select * from employees order by id desc
            """)
    List<Map<String, Object>> getData();

}

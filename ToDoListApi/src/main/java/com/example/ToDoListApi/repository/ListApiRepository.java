package com.example.ToDoListApi.repository;

import com.example.ToDoListApi.model.ListApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListApiRepository extends JpaRepository<ListApi,Long> {
}

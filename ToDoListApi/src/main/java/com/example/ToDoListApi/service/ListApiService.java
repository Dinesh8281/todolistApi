package com.example.ToDoListApi.service;

import com.example.ToDoListApi.model.ListApi;

import java.util.List;

public interface ListApiService {
    ListApi register(ListApi listApi);

    ListApi getById(Long id);

    List<ListApi> getAll();

    void deleteById(Long id);

    ListApi update(Long id, ListApi listApi);
}

package com.example.ToDoListApi.service;

import com.example.ToDoListApi.model.ListApi;
import com.example.ToDoListApi.repository.ListApiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class LIstApiServiceImp implements ListApiService{
    private final ListApiRepository listApiRepository;
    @Override
    public ListApi register(ListApi listApi) {
        return listApiRepository.save(listApi);

    }

    @Override
    public ListApi getById(Long id) {
        return listApiRepository.findById(id).get();
    }

    @Override
    public List<ListApi> getAll() {
        return listApiRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        listApiRepository.deleteById(id);

    }

    @Override
    public ListApi update(Long id, ListApi listApi) {
      Optional<ListApi> optionalListApi= listApiRepository.findById(id);
      ListApi listApi1=optionalListApi.orElse(null);
        if(listApi1 != null){
            listApi.setDescription(listApi.getDescription());
            listApi.setCompleted(listApi.isCompleted());
            return listApiRepository.save(listApi);
        }
        return null;

    }
}

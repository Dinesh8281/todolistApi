package com.example.ToDoListApi.controller;

import com.example.ToDoListApi.model.ListApi;
import com.example.ToDoListApi.service.ListApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ListApi/")
@RequiredArgsConstructor
public class LIstApiController {
    private final ListApiService listApiService;
    @PostMapping("register")
    public ListApi register(@RequestBody ListApi listApi){
        return listApiService.register(listApi);
    }
    @GetMapping("getById/{id}")
    public ListApi getById(@PathVariable("id") Long id){
        return listApiService.getById(id);
    }
    @GetMapping("getAll")
    public List<ListApi> getAll(){
        return listApiService.getAll();
    }
    @DeleteMapping("deleteById/{id}")
    public String deleteById(@PathVariable("id") Long id){
        listApiService.deleteById(id);
        return "DELETED";

    }
    @PutMapping("update/{id}")
    public ListApi update(@PathVariable Long id,@RequestBody ListApi listApi){
        return listApiService.update(id,listApi);
    }

}



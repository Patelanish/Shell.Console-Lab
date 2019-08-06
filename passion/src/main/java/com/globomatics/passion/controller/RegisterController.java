package com.globomatics.passion.controller;

import com.globomatics.passion.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.globomatics.passion.repository.RegisterRepository;

import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    private RegisterRepository registerRepository;

    @GetMapping("api/v1/register")
    @ResponseStatus(HttpStatus.OK)
    public List<Register> list(){
        return registerRepository.findAll();

    }

    @PostMapping("api/v1/register")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Register register){
        registerRepository.save(register);

    }
    @GetMapping("api/v1/register/{id}")
    public Register get(@PathVariable("id") long id){
        return registerRepository.getOne(id);
    }

}

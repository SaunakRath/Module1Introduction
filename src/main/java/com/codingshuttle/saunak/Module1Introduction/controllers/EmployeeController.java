package com.codingshuttle.saunak.Module1Introduction.controllers;

import com.codingshuttle.saunak.Module1Introduction.dto.EmployeeDTO;
import com.codingshuttle.saunak.Module1Introduction.entities.EmployeeEntity;
import com.codingshuttle.saunak.Module1Introduction.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message : hello#%hes";
//    }

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeId") Long id){
//        return new EmployeeDTO(id, "Saunak","saunak@gmail.com",27, LocalDate.of(2003,02,27),true);

        return employeeRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

//    @RequestParam

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity inputemployee){
//        return "Helloo from POST";
//        inputemployee.setId(100L);
//        return inputemployee;
        return employeeRepository.save(inputemployee);

    }

//    @PutMapping
//    @DeleteMapping
//    @PatchMapping
}

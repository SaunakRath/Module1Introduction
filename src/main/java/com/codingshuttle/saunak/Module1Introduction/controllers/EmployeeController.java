package com.codingshuttle.saunak.Module1Introduction.controllers;

import com.codingshuttle.saunak.Module1Introduction.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message : hello#%hes";
//    }

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long Id){
        return new EmployeeDTO(Id, "Saunak","saunak@gmail.com",27, LocalDate.of(2003,02,27),true);
    }

//    @RequestParam

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputemployee){
//        return "Helloo from POST";
        inputemployee.setId(100L);
        return inputemployee;

    }

//    @PutMapping
//    @DeleteMapping
//    @PatchMapping
}

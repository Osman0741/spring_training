package com.cydeo.controller;

import com.cydeo.dto.AddressDTO;
import com.cydeo.dto.ParentDTO;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.dto.TeacherDTO;
import com.cydeo.service.AddressService;
import com.cydeo.service.ParentService;
import com.cydeo.service.StudentService;
import com.cydeo.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //2b1666c6968ec160f817f63c0dde18c4
public class SchoolController {
    private final TeacherService teacherService;
    private final StudentService studentService;
    private final ParentService parentService;
    private final AddressService addressService;

    public SchoolController(TeacherService teacherService, StudentService studentService, ParentService parentService, AddressService addressService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
        this.parentService = parentService;
        this.addressService = addressService;
    }

    @GetMapping("/teachers")
    public List<TeacherDTO> getAllTeachers(){
        return teacherService.findAll();
    }
    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> getAllStudents(){
        ResponseWrapper responseWrapper = new ResponseWrapper("All Students retrieved successfully", studentService.findAll() );

        return ResponseEntity.status(HttpStatus.OK).body(responseWrapper);
    }
    @GetMapping("/parent/{id}")
    public ResponseEntity<ParentDTO> getParentsById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(parentService.findById(id));
    }
    @GetMapping("/address/{id}")
    public ResponseEntity<ResponseWrapper> getAddress(@PathVariable("id") Long id) throws Exception {
        AddressDTO addressDTO = addressService.findById(id);
        return ResponseEntity.ok(new ResponseWrapper("Address is successfully retrieved", addressDTO));
    }
    @PutMapping("/address/{id}")
    public AddressDTO updateAddress(@PathVariable("id") Long id, @RequestBody AddressDTO addressDTO) throws Exception {
        addressDTO.setId(id);
        return addressService.update(addressDTO);

    }
}

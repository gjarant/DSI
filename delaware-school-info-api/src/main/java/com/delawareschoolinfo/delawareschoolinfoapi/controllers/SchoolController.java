package com.delawareschoolinfo.delawareschoolinfoapi.controllers;

import com.delawareschoolinfo.delawareschoolinfoapi.models.School;
import com.delawareschoolinfo.delawareschoolinfoapi.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/schools")
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/schools/{id}")
    public School getSchoolById(@PathVariable(value = "id") Long schoolId) {
        return schoolService.getSchool(schoolId);
    }
}

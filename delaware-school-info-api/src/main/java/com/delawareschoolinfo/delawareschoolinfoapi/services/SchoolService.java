package com.delawareschoolinfo.delawareschoolinfoapi.services;

import com.delawareschoolinfo.delawareschoolinfoapi.models.School;
import com.delawareschoolinfo.delawareschoolinfoapi.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        List<School> schools = new ArrayList<>();
        schoolRepository.findAll()
        .forEach(schools::add);
        return  schools;
    }

    public School getSchool(Long schoolId) {
        return schoolRepository.findById(schoolId).orElse(null);
    }
}

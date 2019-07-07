package com.delawareschoolinfo.delawareschoolinfoapi.controllers;

import com.delawareschoolinfo.delawareschoolinfoapi.models.SchoolSnapshotInfo;
import com.delawareschoolinfo.delawareschoolinfoapi.services.SchoolSnapshotInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SchoolSnapshotInfoController {

    @Autowired
    SchoolSnapshotInfoService schoolSnapshotInfoService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/schoolinfo/{id}")
    public SchoolSnapshotInfo getSchoolSnapshotInfoById(@PathVariable(value = "id") Long id) {
        return schoolSnapshotInfoService.getSchoolSnapshotInfo(id);
    }
}

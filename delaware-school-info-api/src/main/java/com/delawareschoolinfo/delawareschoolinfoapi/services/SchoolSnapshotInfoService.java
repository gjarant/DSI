package com.delawareschoolinfo.delawareschoolinfoapi.services;

import com.delawareschoolinfo.delawareschoolinfoapi.models.SchoolSnapshotInfo;
import com.delawareschoolinfo.delawareschoolinfoapi.repositories.SchoolSnapshotInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolSnapshotInfoService {

    @Autowired
    SchoolSnapshotInfoRepository schoolSnapshotInfoRepository;

    public SchoolSnapshotInfo getSchoolSnapshotInfo(Long schoolId) {
        return schoolSnapshotInfoRepository.findBySchoolId(schoolId);
    }
}

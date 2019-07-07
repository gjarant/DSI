package com.delawareschoolinfo.delawareschoolinfoapi.repositories;

import com.delawareschoolinfo.delawareschoolinfoapi.models.SchoolSnapshotInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolSnapshotInfoRepository extends CrudRepository<SchoolSnapshotInfo, Long> {

    public SchoolSnapshotInfo findBySchoolId(Long schoolId);
}

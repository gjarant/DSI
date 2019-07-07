package com.delawareschoolinfo.delawareschoolinfoapi.repositories;

import com.delawareschoolinfo.delawareschoolinfoapi.models.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {
}

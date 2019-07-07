package com.delawareschoolinfo.delawareschoolinfoapi.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "schools")
@EntityListeners(AuditingEntityListener.class)

public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String schoolName;

    @NotBlank
    private Long districtId;

    @NotBlank
    private String schoolAddress;

    @NotBlank
    private Long doeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public Long getDoeId() {
        return doeId;
    }

    public void setDoeId(Long doeId) {
        this.doeId = doeId;
    }
}
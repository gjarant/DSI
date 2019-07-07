package com.delawareschoolinfo.delawareschoolinfoapi.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "SchoolSnapshotInfo")
public class SchoolSnapshotInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private Long schoolId;

    @NotBlank
    private Long districtId;

    @NotBlank
    private Long schoolYear;

    @NotBlank
    private Long enrollment;

    @NotBlank
    private double elaScore;

    @NotBlank
    private double mathScore;

    @NotBlank
    private double attendance;

    @NotBlank
    private double AmericanIndianOrAlaskaNative;

    @NotBlank
    private double AsianAmerican;

    @NotBlank
    private double BlackOrAfricanAmerican;

    @NotBlank
    private double HispanicOrLatino;

    @NotBlank
    private double MultiRacial;

    @NotBlank
    private double NativeHawaiianOrOtherPacificIslander;

    @NotBlank
    private double WhiteOrCaucasian;

    @NotBlank
    private double Homeless;

    @NotBlank
    private double EnglishLearners;

    @NotBlank
    private double StudentsWithDisabilities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(Long schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Long getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Long enrollment) {
        this.enrollment = enrollment;
    }

    public double getElaScore() {
        return elaScore;
    }

    public void setElaScore(double elaScore) {
        this.elaScore = elaScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public double getAmericanIndianOrAlaskaNative() {
        return AmericanIndianOrAlaskaNative;
    }

    public void setAmericanIndianOrAlaskaNative(double americanIndianOrAlaskaNative) {
        AmericanIndianOrAlaskaNative = americanIndianOrAlaskaNative;
    }

    public double getAsianAmerican() {
        return AsianAmerican;
    }

    public void setAsianAmerican(double asianAmerican) {
        AsianAmerican = asianAmerican;
    }

    public double getBlackOrAfricanAmerican() {
        return BlackOrAfricanAmerican;
    }

    public void setBlackOrAfricanAmerican(double blackOrAfricanAmerican) {
        BlackOrAfricanAmerican = blackOrAfricanAmerican;
    }

    public double getHispanicOrLatino() {
        return HispanicOrLatino;
    }

    public void setHispanicOrLatino(double hispanicOrLatino) {
        HispanicOrLatino = hispanicOrLatino;
    }

    public double getMultiRacial() {
        return MultiRacial;
    }

    public void setMultiRacial(double multiRacial) {
        MultiRacial = multiRacial;
    }

    public double getNativeHawaiianOrOtherPacificIslander() {
        return NativeHawaiianOrOtherPacificIslander;
    }

    public void setNativeHawaiianOrOtherPacificIslander(double nativeHawaiianOrOtherPacificIslander) {
        NativeHawaiianOrOtherPacificIslander = nativeHawaiianOrOtherPacificIslander;
    }

    public double getWhiteOrCaucasian() {
        return WhiteOrCaucasian;
    }

    public void setWhiteOrCaucasian(double whiteOrCaucasian) {
        WhiteOrCaucasian = whiteOrCaucasian;
    }

    public double getHomeless() {
        return Homeless;
    }

    public void setHomeless(double homeless) {
        Homeless = homeless;
    }

    public double getEnglishLearners() {
        return EnglishLearners;
    }

    public void setEnglishLearners(double englishLearners) {
        EnglishLearners = englishLearners;
    }

    public double getStudentsWithDisabilities() {
        return StudentsWithDisabilities;
    }

    public void setStudentsWithDisabilities(double studentsWithDisabilities) {
        StudentsWithDisabilities = studentsWithDisabilities;
    }
}




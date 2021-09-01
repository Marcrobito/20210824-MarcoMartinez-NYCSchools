package dev.eighteentech.a20210824_marcomartinez_nycschools.entity;

public class SAT {
    private String dbn;
    private String school_name;
    private Integer num_of_sat_test_takers;
    private Integer sat_critical_reading_avg_score;
    private Integer sat_math_avg_score;
    private Integer sat_writing_avg_score;

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public Integer getNum_of_sat_test_takers() {
        return num_of_sat_test_takers;
    }

    public void setNum_of_sat_test_takers(Integer num_of_sat_test_takers) {
        this.num_of_sat_test_takers = num_of_sat_test_takers;
    }

    public Integer getSat_critical_reading_avg_score() {
        return sat_critical_reading_avg_score;
    }

    public void setSat_critical_reading_avg_score(Integer sat_critical_reading_avg_score) {
        this.sat_critical_reading_avg_score = sat_critical_reading_avg_score;
    }

    public Integer getSat_math_avg_score() {
        return sat_math_avg_score;
    }

    public void setSat_math_avg_score(Integer sat_math_avg_score) {
        this.sat_math_avg_score = sat_math_avg_score;
    }

    public Integer getSat_writing_avg_score() {
        return sat_writing_avg_score;
    }

    public void setSat_writing_avg_score(Integer sat_writing_avg_score) {
        this.sat_writing_avg_score = sat_writing_avg_score;
    }


}

package dev.eighteentech.a20210824_marcomartinez_nycschools.network;

import java.util.List;

import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.SAT;
import io.reactivex.Observable;

import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.School;
import retrofit2.http.GET;

public interface Api {
    @GET("/s3k6-pzi2")
    Observable<List<School>> getSchoolList();

    @GET("/f9bf-2cp4")
    Observable<List<SAT>> getSchoolsSAT();
}

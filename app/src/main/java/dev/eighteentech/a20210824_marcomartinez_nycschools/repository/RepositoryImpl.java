package dev.eighteentech.a20210824_marcomartinez_nycschools.repository;

import android.annotation.SuppressLint;

import java.util.List;

import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.SAT;
import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.School;
import dev.eighteentech.a20210824_marcomartinez_nycschools.network.Api;
import dev.eighteentech.a20210824_marcomartinez_nycschools.network.Service;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RepositoryImpl implements Main.Repository {

    private Main.BaseViewModel viewModel;
    private Observable<List<School>> schoolsObservable;
    private Observable<List<SAT>> satObservable;
    private Api api;

    public RepositoryImpl(){
        api = Service.service;
    }

    @SuppressLint("CheckResult")
    @Override
    public void loadSchools() {
        schoolsObservable = api.getSchoolList();
        schoolsObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(viewModel::schoolsHasBeenLoaded);
    }

    @SuppressLint("CheckResult")
    @Override
    public void loadSATs() {
        satObservable = api.getSchoolsSAT();
        satObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(viewModel::satHasBeenLoaded);
    }

    @Override
    public void setViewModel(Main.BaseViewModel viewModel) {
        this.viewModel = viewModel;
    }
}

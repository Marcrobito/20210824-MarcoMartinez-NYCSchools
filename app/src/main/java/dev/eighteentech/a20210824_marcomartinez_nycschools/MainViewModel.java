package dev.eighteentech.a20210824_marcomartinez_nycschools;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.SAT;
import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.School;
import dev.eighteentech.a20210824_marcomartinez_nycschools.repository.Main.BaseViewModel;
import dev.eighteentech.a20210824_marcomartinez_nycschools.repository.Main.Repository;
import dev.eighteentech.a20210824_marcomartinez_nycschools.repository.RepositoryImpl;

public class MainViewModel extends ViewModel implements BaseViewModel {

    private MutableLiveData<List<School>> schools;

    private Repository repository;

    MainViewModel(){
        repository = new RepositoryImpl();
        loadSchools();
    }

    public LiveData<List<School>> getSchools() {
        if (schools == null) {
            schools = new MutableLiveData<List<School>>();
            loadSchools();
        }
        return schools;
    }

    private void loadSchools() {
        repository.loadSchools();
    }

    @Override
    public void schoolsHasBeenLoaded(List<School> schoolList) {
        Log.d("TAG",schoolList.toString());
    }

    @Override
    public void satHasBeenLoaded(List<SAT> satList) {

    }
}

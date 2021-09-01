package dev.eighteentech.a20210824_marcomartinez_nycschools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.School;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<School>> schools;
    public LiveData<List<School>> getSchools() {
        if (schools == null) {
            schools = new MutableLiveData<List<School>>();
            loadSchools();
        }
        return schools;
    }

    private void loadSchools() {
    }

    MainViewModel(){

    }
}

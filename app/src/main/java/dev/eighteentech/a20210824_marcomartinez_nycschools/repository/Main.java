package dev.eighteentech.a20210824_marcomartinez_nycschools.repository;

import java.util.List;

import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.SAT;
import dev.eighteentech.a20210824_marcomartinez_nycschools.entity.School;

public interface Main {
    public interface Repository{
        public void loadSchools();
        public void loadSATs();
        public void setViewModel(BaseViewModel viewModel);
    }

    public interface BaseViewModel{
        public void schoolsHasBeenLoaded(List<School> schoolList);
        public void satHasBeenLoaded(List<SAT> satList);
    }

}
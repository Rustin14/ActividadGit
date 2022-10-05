package com.hackaprende.earthquakemonitor.main;


import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.hackaprende.earthquakemonitor.Earthquake;

import java.util.List;

public class MainViewModel extends ViewModel {

    public final MutableLiveData<List<Earthquake>> eqList = new MutableLiveData<>();

    public LiveData<List<Earthquake>> getEqList() {
        return eqList;
    }

    private final MainRepository repository = new MainRepository();

    public void getEarthquakes(){
        repository.getEarthquakes(earthquakeList -> {
            eqList.setValue(earthquakeList);
        });
    }


}

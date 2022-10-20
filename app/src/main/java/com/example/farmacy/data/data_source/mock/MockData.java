package com.example.farmacy.data.data_source.mock;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.farmacy.data.model.Medicine;

import java.util.List;

public class MockData {
    public LiveData<List<Medicine>> allMedicine() {
        MutableLiveData<List<Medicine>> medicine = new MutableLiveData<>();



        return medicine;
    }
}

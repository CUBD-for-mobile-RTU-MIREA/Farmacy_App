package com.example.farmacy.data.repository;

import androidx.lifecycle.LiveData;

import com.example.farmacy.data.data_source.mock.MockData;
import com.example.farmacy.data.model.Medicine;

import java.util.List;

public class Repository implements IRepository{
    MockData mock;

    public Repository(MockData mock) {
        this.mock = mock;
    }

    @Override
    public LiveData<List<Medicine>> allMedicine() {
        return mock.allMedicine();
    }

    @Override
    public LiveData<Medicine> medicineById(int medicineId) {
        return null;
    }


    @Override
    public void addMedicine(Medicine newMedicine) {

    }

    @Override
    public void deleteMedicine(int medicineId) {

    }
}

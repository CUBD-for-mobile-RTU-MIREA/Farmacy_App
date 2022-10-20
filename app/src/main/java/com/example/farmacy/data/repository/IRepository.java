package com.example.farmacy.data.repository;

import androidx.lifecycle.LiveData;

import com.example.farmacy.data.model.Medicine;

import java.util.List;

public interface IRepository {
    LiveData<List<Medicine>> allMedicine();
    LiveData<Medicine> medicineById(int medicineId);

    void addMedicine(Medicine newMedicine);
    void deleteMedicine(int medicineId);
}

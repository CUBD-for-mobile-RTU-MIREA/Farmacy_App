package com.example.farmacy.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.farmacy.data.model.Medicine;
import com.example.farmacy.data.repository.IRepository;
import com.example.farmacy.di.ServiceLocator;

import java.util.List;

public class ControlMedicineViewModel extends ViewModel {
    private IRepository repository;

    public ControlMedicineViewModel() {
        this.repository = ServiceLocator.getInstance().getRepository();
    }

    LiveData<List<Medicine>> allMedicine() {
        return repository.allMedicine();
    }

    void deleteMedicine(int medicineId) {
        repository.deleteMedicine(medicineId);
    }
}
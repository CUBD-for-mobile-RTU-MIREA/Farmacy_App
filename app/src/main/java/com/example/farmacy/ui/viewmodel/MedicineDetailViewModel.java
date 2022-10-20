package com.example.farmacy.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.farmacy.data.model.Medicine;
import com.example.farmacy.data.repository.IRepository;
import com.example.farmacy.di.ServiceLocator;

public class MedicineDetailViewModel extends ViewModel {
    private IRepository repository;

    public MedicineDetailViewModel() {
        this.repository = ServiceLocator.getInstance().getRepository();
    }

    LiveData<Medicine> medicineById(int medicineId) {
        return repository.medicineById(medicineId);
    }
}
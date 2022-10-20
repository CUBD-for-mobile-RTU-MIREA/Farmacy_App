package com.example.farmacy.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.farmacy.data.model.Category;
import com.example.farmacy.data.model.Medicine;
import com.example.farmacy.data.repository.IRepository;
import com.example.farmacy.di.ServiceLocator;

import java.util.List;

public class AddMedicineViewModel extends ViewModel {
    private IRepository repository;

    public AddMedicineViewModel() {
        this.repository = ServiceLocator.getInstance().getRepository();
    }

    void addNewMedicine(int id, String title, String description, double price, List<Category> categories, boolean isRecipe) {
        repository.addMedicine(new Medicine(id, title, description, price, categories, isRecipe));
    }
}
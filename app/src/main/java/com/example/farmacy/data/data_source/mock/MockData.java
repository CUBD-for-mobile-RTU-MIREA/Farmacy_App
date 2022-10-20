package com.example.farmacy.data.data_source.mock;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.farmacy.data.model.Category;
import com.example.farmacy.data.model.Medicine;
import com.example.farmacy.data.model.Symptom;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MockData {
    List<Symptom> symptoms;
    List<Category> categories;
    List<Medicine> medicines;

    public MockData() {
        symptoms = List.of(
                new Symptom(1, "Головная боль"),
                new Symptom(2, "Температура"),
                new Symptom(3, "Боль в конечности"),
                new Symptom(4, "Живот болит"),
                new Symptom(5, "Диареия")
        );

        Category ponos = new Category(
                4,
                "Против поноса",
                null,
                new ArrayList<>(),
                List.of(
                        getSymptomById(5)
                )
        );
        categories = List.of(
                new Category(
                        1,
                        "Жаропонижающее",
                        null,
                        new ArrayList<>(),
                        List.of(
                                getSymptomById(2)
                        )
                ),
                new Category(
                        2,
                        "Болеутоляющее",
                        null,
                        new ArrayList<>(),
                        List.of(
                                getSymptomById(1),
                                getSymptomById(3)
                        )
                ),
                new Category(3,
                        "Желудочное",
                        null,
                        List.of(ponos),
                        List.of(
                                getSymptomById(4),
                                getSymptomById(5)
                        )
                ),
                ponos

        );

        medicines = List.of(
                new Medicine(
                        1,
                        "Нурофен",
                        "",
                        10,
                        List.of(
                              getCategoryById(1),
                              getCategoryById(2)
                        ),
                        false
                )
        );
    }

    private Symptom getSymptomById(int id) {
        return symptoms.stream().filter(symptom -> symptom.getId() == id).findFirst().orElse(null);
    }

    private Category getCategoryById(int id) {
        return categories.stream().filter(category -> category.getId() == id).findFirst().orElse(null);
    }

    private Medicine getMedicineById(int id) {
        return medicines.stream().filter(medicine -> medicine.getId() == id).findFirst().orElse(null);
    }

    public LiveData<List<Medicine>> allMedicine() {
        MutableLiveData<List<Medicine>> medicine = new MutableLiveData<>();

        medicine.setValue(medicines);

        return medicine;
    }

    public LiveData<Medicine> medicineById(int id) {
        MutableLiveData<Medicine> medicine = new MutableLiveData<>();
        medicine.setValue(getMedicineById(id));

        return medicine;
    }

    public void addMedicine(Medicine newMedicine) {
        medicines.add(newMedicine);
    }

    public void deleteMedicine(int medicineId) {
        medicines.remove(getMedicineById(medicineId));
    }
}

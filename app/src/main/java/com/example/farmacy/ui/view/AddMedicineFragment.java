package com.example.farmacy.ui.view;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.farmacy.R;
import com.example.farmacy.ui.viewmodel.AddMedicineViewModel;

public class AddMedicineFragment extends Fragment {

    private AddMedicineViewModel mViewModel;

    public static AddMedicineFragment newInstance() {
        return new AddMedicineFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_medicine, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AddMedicineViewModel.class);
        // TODO: Use the ViewModel
    }

}
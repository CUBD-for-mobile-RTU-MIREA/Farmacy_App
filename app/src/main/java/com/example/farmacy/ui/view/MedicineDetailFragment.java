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
import com.example.farmacy.ui.viewmodel.MedicineDetailViewModel;

public class MedicineDetailFragment extends Fragment {

    private MedicineDetailViewModel mViewModel;

    public static MedicineDetailFragment newInstance() {
        return new MedicineDetailFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_medicine_detail, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MedicineDetailViewModel.class);
        // TODO: Use the ViewModel
    }

}
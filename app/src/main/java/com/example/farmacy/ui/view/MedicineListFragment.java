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
import com.example.farmacy.ui.viewmodel.MedicineListViewModel;

public class MedicineListFragment extends Fragment {

    private MedicineListViewModel mViewModel;

    public static MedicineListFragment newInstance() {
        return new MedicineListFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_medicine_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MedicineListViewModel.class);
        // TODO: Use the ViewModel
    }

}
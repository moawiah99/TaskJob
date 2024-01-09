package com.example.taskjob.UI.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.taskjob.Adapter.ItemAdapter;
import com.example.taskjob.databinding.FragmentMarinerBinding;


public class MarinerFragment extends Fragment {

    FragmentMarinerBinding binding;

    ItemAdapter adapter;

    public MarinerFragment() {
    }


    public static MarinerFragment newInstance(String param1, String param2) {
        MarinerFragment fragment = new MarinerFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMarinerBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        adapter = new ItemAdapter();
        binding.recyclerView.setAdapter(adapter);
    }
}
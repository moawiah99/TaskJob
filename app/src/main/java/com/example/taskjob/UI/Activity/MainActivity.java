package com.example.taskjob.UI.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.taskjob.Adapter.ContactAdapter;
import com.example.taskjob.Adapter.PagerAdapter;
import com.example.taskjob.R;
import com.example.taskjob.UI.Fragment.MapFragment;
import com.example.taskjob.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    PagerAdapter pagerAdapter;
    ContactAdapter contactAdapter;
    ActivityMainBinding binding;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        addNameOfTab();
        initialize();


    }

    private void initialize() {
        Fragment fragment = new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), getLifecycle());

        binding.viewPager.setSaveEnabled(false);
        binding.viewPager.setAdapter(pagerAdapter);
        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, position) -> tab.setText(list.get(position))
        ).attach();

        contactAdapter = new ContactAdapter();
        binding.recyclerView1.setAdapter(contactAdapter);
    }

    private void addNameOfTab() {
        list.add("Marinier updates");
        list.add("News");
        list.add("Events");
        list.add("Polls");
        list.add("Jobs");
    }


}
package com.example.taskjob.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.taskjob.UI.Fragment.MarinerFragment;

public class PagerAdapter extends FragmentStateAdapter {
    private static final int NUM_PAGES = 5;

    public PagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new MarinerFragment();
    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}

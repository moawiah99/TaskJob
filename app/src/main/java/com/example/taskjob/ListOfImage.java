package com.example.taskjob;

import java.util.ArrayList;
import java.util.List;

public class ListOfImage {
    public static List<Integer> getImageList() {

        List<Integer> imageList = new ArrayList<>();

        imageList.add(R.drawable.ic_imag1);
        imageList.add(R.drawable.ic_imag2);
        imageList.add(R.drawable.ic_imag3);
        imageList.add(R.drawable.ic_imag4);
        imageList.add(R.drawable.ic_imag5);
        return imageList;
    }
}
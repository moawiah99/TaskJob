package com.example.taskjob;

import com.example.taskjob.models.FishModel;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<FishModel> getFishList() {

        List<FishModel> fishModels = new ArrayList<>();

        fishModels.add(new FishModel(R.drawable.ic_imag1,"Marinier Update Title","565677,Revesion,Start and End","Date"));
        fishModels.add(new FishModel(R.drawable.ic_imag2,"Marinier Update Title","565677,Revesion,Start and End","Date"));
        fishModels.add(new FishModel(R.drawable.ic_imag3,"Marinier Update Title","565677,Revesion,Start and End","Date"));
        fishModels.add(new FishModel(R.drawable.ic_imag4,"Marinier Update Title","565677,Revesion,Start and End","Date"));
        fishModels.add(new FishModel(R.drawable.ic_imag5,"Marinier Update Title","565677,Revesion,Start and End","Date"));

        return fishModels;
    }
}
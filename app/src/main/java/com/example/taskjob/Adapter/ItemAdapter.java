package com.example.taskjob.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskjob.DummyData;
import com.example.taskjob.R;
import com.example.taskjob.models.FishModel;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private List<FishModel> fishModels;

    public ItemAdapter() {
        this.fishModels = DummyData.getFishList();
    }


    @NonNull
    @Override
    public ItemAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fish_list_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ItemViewHolder holder, int position) {
        FishModel model=fishModels.get(position);

        int imageResource = model.getImageResource();
        holder.imageView.setImageResource(imageResource);
        holder.title.setText(model.getTitle());
        holder.description.setText(model.getDescription());
        holder.date.setText(model.getDate());
    }

    @Override
    public int getItemCount() {
        return fishModels.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title,description,date;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            date = itemView.findViewById(R.id.date);
        }
    }
}

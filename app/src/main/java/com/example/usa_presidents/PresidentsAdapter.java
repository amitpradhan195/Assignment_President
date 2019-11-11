package com.example.usa_presidents;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PresidentsAdapter extends RecyclerView.Adapter<PresidentsAdapter.PresidentsViewHolder> {
    Context mContext;
    List<Presidents> presidentsList;

    public PresidentsAdapter(Context mContext, List<Presidents> presidentsList) {
        this.mContext = mContext;
        this.presidentsList=presidentsList;
    }

    @NonNull
    @Override
    public PresidentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.president,parent,false);
        return new PresidentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PresidentsViewHolder holder, int i) {
        final Presidents presidents = presidentsList.get(i);
        holder.imgProfile.setImageResource(presidents.getImage());
        holder.presidentName.setText(presidents.getName());
        //holder.about.setText(presidents.getAbout());

        holder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,DetailsActivity.class);

                intent.putExtra("image",presidents.getImage());
                intent.putExtra("name",presidents.getName());
                intent.putExtra("about",presidents.getAbout());

                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return presidentsList.size();
    }

    public class PresidentsViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imgProfile;
        TextView presidentName,about;
        public PresidentsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile= itemView.findViewById(R.id.imgProfile);
            presidentName= itemView.findViewById(R.id.fullName);
            //about=itemView.findViewById(R.id.about);
        }
    }
}

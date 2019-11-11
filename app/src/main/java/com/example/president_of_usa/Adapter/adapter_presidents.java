package com.example.president_of_usa.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.president_of_usa.Activity.activity_details;
import com.example.president_of_usa.Model.model_presidents;
import com.example.president_of_usa.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class adapter_presidents extends RecyclerView.Adapter<adapter_presidents.PresidentsViewHolder> {
    Context mContext;
    List<model_presidents> presidentsList;

    public adapter_presidents(Context mContext, List<model_presidents> presidentsList) {
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
        final model_presidents modelpresidents = presidentsList.get(i);
        holder.imgProfile.setImageResource(modelpresidents.getImage());
        holder.presidentName.setText(modelpresidents.getName());
        //holder.about.setText(modelpresidents.getAbout());

        holder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, activity_details.class);

                intent.putExtra("image", modelpresidents.getImage());
                intent.putExtra("name", modelpresidents.getName());
                intent.putExtra("about", modelpresidents.getAbout());

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

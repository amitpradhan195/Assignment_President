package com.example.usa_presidents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    //Toolbar mActionBarToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Presidents> presidentsList = new ArrayList<>();
        presidentsList.add(new Presidents("Barack Obama",R.drawable.barack,"Barack Hussein Obama II is an American attorney and politician who served as the 44th president of the United States from 2009 to 2017."));
        presidentsList.add(new Presidents("Donald Trump",R.drawable.donald,"Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality. "));
        presidentsList.add(new Presidents("George W. Bush",R.drawable.george,"George Walker Bush is an American politician and businessman who served as the 43rd president of the United States from 2001 to 2009. He had previously served as the 46th governor of Texas from 1995 to 2000."));
        presidentsList.add(new Presidents("Bill Clinton",R.drawable.bill,"William Jefferson Clinton is an American politician who served as the 42nd president of the United States from 1993 to 2001."));
        presidentsList.add(new Presidents("Ronald Reagan",R.drawable.ronald,"Ronald Wilson Reagan was an American politician who served as the 40th president of the United States from 1981 to 1989 and became the highly influential voice of modern conservatism."));
        presidentsList.add(new Presidents("Jimmy Carter",R.drawable.jimmy,"James Earl Carter Jr. is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981."));

        PresidentsAdapter presidentsAdapter = new PresidentsAdapter(this,presidentsList);
        recyclerView.setAdapter(presidentsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}

package com.example.president_of_usa.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.president_of_usa.Adapter.adapter_presidents;
import com.example.president_of_usa.Model.model_presidents;
import com.example.president_of_usa.R;

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
        List<model_presidents> presidentsList = new ArrayList<>();
        presidentsList.add(new model_presidents("Donald Trump",R.drawable.donald,"Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality. "));
        presidentsList.add(new model_presidents("Bill Clinton",R.drawable.bill,"William Jefferson Clinton is an American politician who served as the 42nd president of the United States from 1993 to 2001."));
        presidentsList.add(new model_presidents("Ronald Reagan",R.drawable.ronald,"Ronald Wilson Reagan was an American politician who served as the 40th president of the United States from 1981 to 1989 and became the highly influential voice of modern conservatism."));
        presidentsList.add(new model_presidents("Jimmy Carter",R.drawable.jimmy,"James Earl Carter Jr. is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981."));
        presidentsList.add(new model_presidents("George W. Bush",R.drawable.george,"George Walker Bush is an American politician and businessman who served as the 43rd president of the United States from 2001 to 2009. He had previously served as the 46th governor of Texas from 1995 to 2000."));
        presidentsList.add(new model_presidents("Barack Obama",R.drawable.barack,"Barack Hussein Obama II is an American attorney and politician who served as the 44th president of the United States from 2009 to 2017."));


        adapter_presidents adapterpresidents = new adapter_presidents(this,presidentsList);
        recyclerView.setAdapter(adapterpresidents);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}

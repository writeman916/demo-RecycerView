package com.example.kuroshiro.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView()
    {
        // lookup the recyclerview in activity layout
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        // initialize datahinh
        ArrayList<DataHinh> arr = new ArrayList<>();
        arr.add(new DataHinh(R.drawable.sharingan,"Black Panther"));
        arr.add(new DataHinh(R.drawable.sharingan,"Black 1"));
        arr.add(new DataHinh(R.drawable.sharingan,"Black 2"));
        arr.add(new DataHinh(R.drawable.sharingan,"Black 3"));

        // create adapter and set adapter
        HinhAdapter hinhAdapter = new HinhAdapter(arr);
        recyclerView.setAdapter(hinhAdapter);


        // create layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);


    }
}


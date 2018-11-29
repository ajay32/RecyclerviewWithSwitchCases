package com.ajay.recyclerviewwithswitchcases;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] contry = {"India","Pakistan","Bangladesh","China","SiiLanks","America","Bhutan",
            "Afganisthan","Nigeria","SouthAfica"};
    String[] capital = {"Delhi","Billi","SadStory","laCosa","Costa","Parveeb","Kotali","Mitali","Rutba","Korma"};
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView) findViewById(R.id.recycler_bin);

        recyclerAdapter = new RecyclerAdapter(capital,contry,numbers,3);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
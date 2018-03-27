package com.example.android.takehomeassignment08_cbest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Instagram> instaposts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new InstagramAdapter(instaposts, this));
    }

    private void initialData() {
        instaposts = new ArrayList<>();
        instaposts.add(new Instagram(R.string.bestbetruthful, R.string.othello_string, R.drawable.othello, R.string.bestbetruthful));
        instaposts.add(new Instagram(R.string.araj, R.string.marley_string, R.drawable.marley, R.string.araj));
        instaposts.add(new Instagram(R.string.leapnleash, R.string.fun, R.drawable.fish, R.string.leapnleash));
        instaposts.add(new Instagram(R.string.bestbetruthful, R.string.fun, R.drawable.airforceones, R.string.bestbetruthful));
//Pics were originally too big, not enough memory to run app. Resized and rebuilt app, some minor changes necessary for formatting looks. 
    }
}
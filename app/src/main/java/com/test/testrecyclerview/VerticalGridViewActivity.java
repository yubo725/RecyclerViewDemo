package com.test.testrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.test.testrecyclerview.adapter.VGridViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class VerticalGridViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_grid_view);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //垂直的GridView，分4列显示
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL));
        List<String> data = new ArrayList<>();
        for(int i = 0; i < 30; i++) {
            data.add("item " + i);
        }
        recyclerView.setAdapter(new VGridViewAdapter(this, data));
    }
}

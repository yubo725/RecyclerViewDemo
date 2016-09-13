package com.test.testrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.test.testrecyclerview.adapter.HGridViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 水平的GridView
 */
public class HorizontalGridViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_grid_view);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //水平的GridView，分4行显示
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL));
        List<String> data = new ArrayList<>();
        for(int i = 0; i < 30; i++) {
            data.add("item " + i);
        }
        recyclerView.setAdapter(new HGridViewAdapter(this, data));
    }
}

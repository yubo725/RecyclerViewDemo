package com.test.testrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.test.testrecyclerview.adapter.VGridViewAdapter;
import com.test.testrecyclerview.adapter.WaterFallAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 瀑布流
 */
public class WaterFallActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_fall);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //垂直的GridView，分4列显示
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL));
        List<String> data = new ArrayList<>();
        for(int i = 0; i < 80; i++) {
            data.add("item " + i);
        }
        recyclerView.setAdapter(new WaterFallAdapter(this, data));
    }
}

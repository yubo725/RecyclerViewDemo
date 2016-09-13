package com.test.testrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void normalListView(View view) {
        startActivity(new Intent(this, NormalListViewActivity.class));
    }

    public void hGridView(View view) {
        startActivity(new Intent(this, HorizontalGridViewActivity.class));
    }

    public void vGridView(View view) {
        startActivity(new Intent(this, VerticalGridViewActivity.class));
    }

    public void waterFall(View view) {
        startActivity(new Intent(this, WaterFallActivity.class));
    }

}

package com.test.testrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.test.testrecyclerview.adapter.NormalListViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 普通的ListView
 */
public class NormalListViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_list_view);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final List<String> data = new ArrayList<>();
        for(int i = 0; i < 30; i++) {
            data.add("item " + i);
        }
        NormalListViewAdapter adapter = new NormalListViewAdapter(this, data);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new NormalListViewAdapter.OnItemClickListener() {
            @Override
            public void onClick(View itemView, int position) {
                showToast(String.format("%s clicked", data.get(position)));
            }
        });

    }

    public void showToast(String msg) {
        Toast.makeText(NormalListViewActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}

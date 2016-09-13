package com.test.testrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.test.testrecyclerview.R;

import java.util.List;

/**
 * Created by yubo7 on 2016/9/13.
 * 垂直GridView适配器
 */

/**
 * Created by yubo7 on 2016/9/13.
 */
public class VGridViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<String> listData;
    private LayoutInflater layoutInflater;

    public VGridViewAdapter(Context context, List<String> listData) {
        this.context = context;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(layoutInflater.inflate(R.layout.grid_item_vertical, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}

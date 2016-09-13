package com.test.testrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.test.testrecyclerview.R;

import java.util.List;
import java.util.Random;

/**
 * Created by yubo7 on 2016/9/13.
 * 垂直GridView适配器
 */

/**
 * Created by yubo7 on 2016/9/13.
 */
public class WaterFallAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<String> listData;
    private LayoutInflater layoutInflater;
    private int[] heights; //保存每个item的高度
    private Random random;

    public WaterFallAdapter(Context context, List<String> listData) {
        this.context = context;
        this.listData = listData;

        this.random = new Random();
        this.heights = new int[listData.size()];
        //生成随机的高度值
        for(int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(200) + 100;
        }
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(layoutInflater.inflate(R.layout.grid_item_vertical, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ViewGroup.LayoutParams params = holder.tv.getLayoutParams();
        //设置item的高度
        params.height = heights[position];
        holder.tv.setLayoutParams(params);
        holder.tv.setText(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}

package com.test.testrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.testrecyclerview.R;

import java.util.List;

/**
 * Created by yubo7 on 2016/9/13.
 */
public class NormalListViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<String> listData; //listview数据集合
    private LayoutInflater layoutInflater;
    private OnItemClickListener onItemClickListener;

    public NormalListViewAdapter(Context context, List<String> listData) {
        this.context = context;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //创建ViewHolder，这里要注意必须使用layoutInflater.inflate(R.layout.list_item_normal, parent, false)创建，否则会报错
        MyViewHolder holder = new MyViewHolder(layoutInflater.inflate(R.layout.list_item_normal, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tv.setText(listData.get(position));
        //如果监听器不为空，就在这里为ListItem绑定点击事件处理
        if(this.onItemClickListener != null) {
            holder.tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onClick(v, position);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    //接口定义，用于处理ListItem的点击事件
    public interface OnItemClickListener {
        void onClick(View itemView, int position);
    }

    //给Adapter设置ListItem点击监听器
    public void setOnItemClickListener(OnItemClickListener listener) {
        if(listener != null) {
            this.onItemClickListener = listener;
        }
    }

}

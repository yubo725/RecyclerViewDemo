package com.test.testrecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.test.testrecyclerview.R;

/**
 * Created by yubo7 on 2016/9/13.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView tv;

    public MyViewHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.list_item_tv);
    }

}

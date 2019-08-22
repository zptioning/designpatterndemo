package com.zptioning.designpatterndemo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHoler> {

    private List<ItemData> mData;
    private Context mContext;

    public CustomAdapter(List<ItemData> data,Context context) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public CustomViewHoler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup, false);
        return new CustomViewHoler(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHoler customViewHoler, final int i) {
        customViewHoler.mTextView.setText(mData.get(i).getName());
        customViewHoler.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Class<?> aClass = Class.forName(mData.get(i).getClassName());
                    Intent intent = new Intent(mContext, aClass);
                    mContext.startActivity(intent);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return null == mData ? 0 : mData.size();
    }


    static class CustomViewHoler extends RecyclerView.ViewHolder {
        TextView mTextView;

        public CustomViewHoler(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_content);
        }
    }
}

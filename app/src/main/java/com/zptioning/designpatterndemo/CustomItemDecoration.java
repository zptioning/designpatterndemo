package com.zptioning.designpatterndemo;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class CustomItemDecoration extends RecyclerView.ItemDecoration {

    // 单位 dp
    private int gap = 2;

    public CustomItemDecoration() {
    }

    public CustomItemDecoration(int gap) {
        this.gap = gap;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        // 获取列数
        int spanCount = ((GridLayoutManager) parent.getLayoutManager()).getSpanCount();
        if (childAdapterPosition % spanCount == spanCount - 1) {
            outRect.set(0, 0, 0, gap);
        } else {
            outRect.set(0, 0, gap, gap);
        }
    }
}

package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class LineDividerDecoration extends RecyclerView.ItemDecoration {

    private Paint mPaint;

    public LineDividerDecoration() {
        mPaint = new Paint();
        mPaint.setColor(0x22000000);
        mPaint.setStrokeWidth(2);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int numChildren = parent.getChildCount();
        for (int i = 0; i < numChildren; i++) {
            View child = parent.getChildAt(i);

            // Adjust y by the offset to account for animations
            int y = child.getTop() + (int)child.getTranslationY();
            c.drawLine(0, y, child.getRight(), y, mPaint);
        }
    }
}

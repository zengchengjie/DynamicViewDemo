package com.example.a10062376.dynamicviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 10062376 on 2018/1/2.
 */

public class DrawLine extends View {
    Paint linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public DrawLine(Context context) {
        super(context);
    }

    public DrawLine(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawLine(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        linePaint.setStrokeWidth(15);
        float lineArray[] = new float[]{50,50,400,50,
                400,50,400,600,
                400,600,50,600,
                60,600,50,50};//x、y的起始和结束坐标 一共四个
        canvas.drawLines(lineArray,linePaint);
    }
}

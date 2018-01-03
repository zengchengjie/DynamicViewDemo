package com.example.a10062376.dynamicviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 10062376 on 2018/1/2.
 */

public class DrawPoint extends View {
    Paint pointPaint = new Paint();


    public DrawPoint(Context context) {
        super(context);
    }

    public DrawPoint(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPoint(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pointPaint.setColor(Color.YELLOW);
        pointPaint.setStrokeWidth(30);
//        pointPaint.setStrokeCap(Paint.Cap.ROUND);//设置线条端点的形状 圆头
//        pointPaint.setStrokeCap(Paint.Cap.SQUARE);//设置线条端点的形状 方头
        pointPaint.setStrokeCap(Paint.Cap.BUTT);//设置线条端点的形状 平头
        canvas.drawPoint(250, 250, pointPaint);
        float[] points = {0, 0, 150, 150, 150, 500, 100, 50, 100, 100, 150, 50, 150, 100};
        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
         /* 跳过两个数，即前两个 0 ,一共绘制 8 个数（4 个点）*/
        canvas.drawPoints(points, 2, 8, pointPaint);
    }
}

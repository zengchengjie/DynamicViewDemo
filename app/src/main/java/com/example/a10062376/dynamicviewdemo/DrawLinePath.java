package com.example.a10062376.dynamicviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 10062376 on 2018/1/3.
 * 用drawPath的方法绘制一条线
 */

public class DrawLinePath extends View {
    Paint paint = new Paint();
    Path path = new Path();
    public DrawLinePath(Context context) {
        super(context);
    }

    public DrawLinePath(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawLinePath(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.STROKE);
        path.lineTo(360,360);//起始点为绝对坐标
        path.rLineTo(60,560);//起始点为相对坐标（最后一次绘制的点）
        canvas.drawPath(path,paint);
    }
}

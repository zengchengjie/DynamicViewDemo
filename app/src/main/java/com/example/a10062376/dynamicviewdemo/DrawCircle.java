package com.example.a10062376.dynamicviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 10062376 on 2017/12/28.
 */

public class DrawCircle extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//创建画笔 Paint.ANTI_ALIAS_FLAG 开启抗锯齿
    public DrawCircle(Context context) {
        super(context);
    }

    public DrawCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawColor(Color.BLACK);//填充画布颜色
        paint.setColor(Color.RED);//默认是黑色
        paint.setStrokeWidth(10);//设置线条宽度
        paint.setStyle(Paint.Style.STROKE);//画一个空心圆
        //此处开始画布上的绘制，前两个参数是X Y坐标值（圆心）起点为左上角 单位px
        canvas.drawCircle(500,500,250,paint);
//        float lineArray[] = new float[]{50,50,400,50,
//                400,50,400,600,
//                400,600,50,600,
//                60,600,50,50};//x、y的起始和结束坐标 一共四个
//        canvas.drawLines(lineArray,paint);
        canvas.drawColor(Color.parseColor("#88880000"));
    }

}

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
 */

public class DrawCirclePath extends View{
    Paint paint = new Paint();
    Path path = new Path();
    public DrawCirclePath(Context context) {
        super(context);
    }

    public DrawCirclePath(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCirclePath(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 使用DrawPath的方式画一个圆
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.GREEN);
        path.addCircle(400,400,50, Path.Direction.CW); //CW clockWise顺时针 CCW counter-clockWise逆时针
        canvas.drawPath(path,paint);
    }
}

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
     * 使用DrawPath的方式画一个圆 当然较之于drawCircle方法更加麻烦 但是DrawPath后续有更大的用处（绘制组合图形）
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.GREEN);
        //CW clockWise顺时针 CCW counter-clockWise逆时针
        path.addCircle(400,400,50, Path.Direction.CW);
        canvas.drawPath(path,paint);
    }
}

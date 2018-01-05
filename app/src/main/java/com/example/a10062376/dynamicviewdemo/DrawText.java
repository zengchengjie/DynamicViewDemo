package com.example.a10062376.dynamicviewdemo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import static android.graphics.Typeface.DEFAULT_BOLD;

/**
 * Created by 10062376 on 2018/1/4.
 */

public class DrawText extends View {
    Paint paint = new Paint();
    String str = "Hello World";
    public DrawText(Context context) {
        super(context);
    }

    public DrawText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setShadowLayer(10,0,0, Color.GREEN);
        paint.setStrokeWidth(20);
        paint.setTextSize(150);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawText("SANS_SERIF",50,300,paint);//x 和 y是左下角的坐标 y是文字的基线
        paint.setShadowLayer(10,0,0, Color.GREEN);
        paint.setStrokeWidth(20);
        paint.setTextSize(150);
        paint.setTypeface(Typeface.DEFAULT);
        canvas.drawText("DEFAULT",50,800,paint);//x 和 y是左下角的坐标 y是文字的基线
        paint.setShadowLayer(10,0,0, Color.GREEN);
        paint.setStrokeWidth(20);
        paint.setTextSize(150);
        paint.setTypeface(Typeface.SERIF);
        canvas.drawText("SERIF",50,1000,paint);//x 和 y是左下角的坐标 y是文字的基线
        paint.setShadowLayer(10,0,0, Color.GREEN);
        paint.setStrokeWidth(20);
        paint.setTextSize(150);
        paint.setTypeface(Typeface.MONOSPACE);
        canvas.drawText("MONOSPACE",50,1200,paint);//x 和 y是左下角的坐标 y是文字的基线
        paint.setShadowLayer(10,0,0, Color.GREEN);
        paint.setStrokeWidth(20);
        paint.setTextSize(150);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("DEFAULT_BOLD",50,1500,paint);//x 和 y是左下角的坐标 y是文字的基线
    }
}

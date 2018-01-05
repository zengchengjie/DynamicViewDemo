package com.example.a10062376.dynamicviewdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 10062376 on 2018/1/4.
 */

public class DrawBitmap extends View {
    Paint paint = new Paint();

    public DrawBitmap(Context context) {
        super(context);
    }

    public DrawBitmap(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawBitmap(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        BitmapDrawable drawable = (BitmapDrawable) getResources().getDrawable(R.drawable.test);
        Bitmap bitmap = drawable.getBitmap();
        paint.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.OUTER));

//        Bitmap bitmapShadow = bitmap.extractAlpha();
        canvas.drawBitmap(bitmap, 100, 100, paint);
    }
}

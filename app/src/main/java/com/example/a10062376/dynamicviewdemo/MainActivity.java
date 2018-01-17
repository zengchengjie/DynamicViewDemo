package com.example.a10062376.dynamicviewdemo;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义View的练习
 */
public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    List<PageModel> pageModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pageModels.add(new PageModel(R.string.drawShape, R.layout.fragment_shape));
        pageModels.add(new PageModel(R.string.drawText, R.layout.fragment_text));
        pageModels.add(new PageModel(R.string.drawBitmap, R.layout.fragment_bitmap));
    }

    private class PageModel {
        //此处使用注解的意义：因为都是int类型的参数，因此需要使用注解进行区分
        @StringRes
        int titleRes;
        @LayoutRes
        int practiceLayout;

        public PageModel(@StringRes int titleRes, @LayoutRes int practiceLayout) {
            this.titleRes = titleRes;
            this.practiceLayout = practiceLayout;
        }
    }
}

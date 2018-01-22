package com.example.a10062376.dynamicviewdemo;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
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

    {
        //初始化界面
        pageModels.add(new PageModel(R.string.drawShape, R.layout.fragment_shape));
        pageModels.add(new PageModel(R.string.drawText, R.layout.fragment_text));
        pageModels.add(new PageModel(R.string.drawBitmap, R.layout.fragment_bitmap));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.pager);
        /*viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                PageModel pageModel = pageModels.get(position);

                return pageF;
            }

            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                //根据给定的参数索引，检索指定参数的值作为 Java 编程语言中的 String。
                return getString(pageModels.get(position).titleRes);
            }
        });*/
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

package com.design.material.materialdesign.loaddrawable;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.design.material.materialdesign.BaseActivity;
import com.design.material.materialdesign.R;

public class ShapeChangeActivity extends BaseActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, ShapeChangeActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected View getRootView() {
        return View.inflate(this, R.layout.activity_shape_change, null);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}

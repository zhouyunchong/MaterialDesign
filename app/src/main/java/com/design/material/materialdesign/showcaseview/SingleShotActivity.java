package com.design.material.materialdesign.showcaseview;/*
 * Copyright 2014 Alex Curran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import android.view.View;

import com.design.material.materialdesign.BaseActivity;
import com.design.material.materialdesign.R;
import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.Target;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

public class SingleShotActivity extends BaseActivity {

    @Override
    protected View getRootView() {
        return View.inflate(this, R.layout.activity_single_shot, null);
    }

    @Override
    protected void initView() {

        Target viewTarget = new ViewTarget(R.id.button, this);
        new ShowcaseView.Builder(this)
                .setTarget(viewTarget)
                .setContentTitle(R.string.title_single_shot)
                .setContentText(R.string.R_string_desc_single_shot)
                .setStyle(R.style.CustomShowcaseTheme3)
                .singleShot(2)
                .build();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}

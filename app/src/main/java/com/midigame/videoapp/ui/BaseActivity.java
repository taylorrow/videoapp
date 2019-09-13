package com.midigame.videoapp.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }

    protected abstract int getLayoutId();

    public void showAppBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().show();
        }
    }

    public void hideAppBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void setBackButton(boolean isEnabled) {
        if (isEnabled) {
            showAppBar();
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(isEnabled);
            getSupportActionBar().setDisplayShowHomeEnabled(isEnabled);
        }
    }

    public void setAppBarTitle(@StringRes int titleResId) {
        if (getSupportActionBar() != null) {
//            getSupportActionBar().setTitle(titleResId);
            TextView textView = new TextView(this);
            textView.setText(titleResId);
            textView.setTextSize(23);
//            textView.setTypeface(null, Typeface.BOLD);
            textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setGravity(Gravity.CENTER);
            textView.setTextColor(Color.WHITE);
            getSupportActionBar().setDisplayOptions(getActionBar().DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(textView);
        }
    }

    public void setAppBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
            TextView textView = new TextView(this);
            textView.setText(title);
            textView.setTextSize(23);
            textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setGravity(Gravity.CENTER);
            textView.setTextColor(Color.WHITE);
            getSupportActionBar().setDisplayOptions(getActionBar().DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(textView);
        }
    }
}

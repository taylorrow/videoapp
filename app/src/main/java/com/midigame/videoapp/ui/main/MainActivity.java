package com.midigame.videoapp.ui.main;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.midigame.videoapp.R;
import com.midigame.videoapp.ui.BaseActivity;
import com.midigame.videoapp.ui.main.callbacks.OnChoiceTrackListener;
import com.midigame.videoapp.ui.main.fragments.ListVideoFragment;
import com.midigame.videoapp.ui.main.fragments.VideoPlayerFragment;

import java.util.Objects;

public class MainActivity extends BaseActivity implements OnChoiceTrackListener {

    private ListVideoFragment listVideoFragment;
    private VideoPlayerFragment videoPlayerFragment;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).setCustomView(R.layout.actionbar);

        listVideoFragment = new ListVideoFragment();
        videoPlayerFragment = new VideoPlayerFragment();

        listVideoFragment.setOnChoiceTrackListener(this);
        setFirstFragment();
    }

    @Override
    public boolean onSupportNavigateUp() {
        setFirstFragment();
        return true;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    public void setFirstFragment() {
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, listVideoFragment);
        setAppBarTitle(R.string.title);
        ft.commit();
    }

    @Override
    public void onChoiceTrack(String trackName, int number) {
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, videoPlayerFragment);
        setAppBarTitle(trackName + number);
        setBackButton(true);
        ft.commit();
    }
}

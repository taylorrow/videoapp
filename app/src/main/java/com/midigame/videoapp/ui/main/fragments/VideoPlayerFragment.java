package com.midigame.videoapp.ui.main.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.midigame.videoapp.R;
import com.midigame.videoapp.ui.main.BaseFragment;

public class VideoPlayerFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_videoplayer;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        VideoView videoView = (VideoView) view.findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.q));
        videoView.requestFocus();
        videoView.start();
    }
}

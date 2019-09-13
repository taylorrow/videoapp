package com.midigame.videoapp.presenter;

import com.midigame.videoapp.data.TrackUiModel;
import com.midigame.videoapp.presenter.contract.MainContract;

import java.util.ArrayList;
import java.util.List;

public class MainRepository implements MainContract.Repository {

    @Override
    public List<TrackUiModel> getVideoList() {
        List<TrackUiModel> uiModels = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            TrackUiModel trackUiModel = new TrackUiModel();
            trackUiModel.trackName = "Track ";
            trackUiModel.trackNumber = i;
            uiModels.add(i - 1, trackUiModel);
        }
        return uiModels;
    }
}

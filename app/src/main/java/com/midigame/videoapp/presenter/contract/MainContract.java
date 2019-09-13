package com.midigame.videoapp.presenter.contract;

import com.midigame.videoapp.data.TrackUiModel;

import java.util.List;

public interface MainContract {

    interface Presenter {
        List<TrackUiModel> getList();
    }

    interface Repository {
        List<TrackUiModel> getVideoList();
    }

    interface View {
    }
}

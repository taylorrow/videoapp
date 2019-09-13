package com.midigame.videoapp.presenter;

import com.midigame.videoapp.data.TrackUiModel;
import com.midigame.videoapp.presenter.contract.MainContract;

import java.util.List;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.Repository mRepository;

    public MainPresenter(MainContract.View mView) {
        mRepository = new MainRepository();
    }

    @Override
    public List<TrackUiModel> getList() {
        return mRepository.getVideoList();
    }
}

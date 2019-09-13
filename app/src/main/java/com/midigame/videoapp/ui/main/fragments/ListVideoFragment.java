package com.midigame.videoapp.ui.main.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.midigame.videoapp.R;
import com.midigame.videoapp.presenter.MainPresenter;
import com.midigame.videoapp.presenter.callbacks.OnItemClickListener;
import com.midigame.videoapp.presenter.contract.MainContract;
import com.midigame.videoapp.ui.main.BaseFragment;
import com.midigame.videoapp.ui.main.adapter.ListVideoAdapter;
import com.midigame.videoapp.ui.main.callbacks.OnChoiceTrackListener;

public class ListVideoFragment extends BaseFragment implements OnItemClickListener, MainContract.View {

    private RecyclerView recyclerView;
    private ListVideoAdapter videoAdapter;

    private MainContract.Presenter mPresenter;
    private OnChoiceTrackListener callback;

    public void setOnChoiceTrackListener(OnChoiceTrackListener callback) {
        this.callback = callback;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_listvideo;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter = new MainPresenter(this);
        videoAdapter = new ListVideoAdapter(mPresenter.getList(), this);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        if (getContext() != null) {
            RecyclerView.ItemDecoration itemDecoration = new
                    DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
            recyclerView.addItemDecoration(itemDecoration);
        }
        recyclerView.setAdapter(videoAdapter);
    }

    @Override
    public void onItemClick(String trackName, int number) {
        callback.onChoiceTrack(trackName, number);
    }
}

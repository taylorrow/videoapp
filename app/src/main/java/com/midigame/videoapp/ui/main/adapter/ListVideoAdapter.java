package com.midigame.videoapp.ui.main.adapter;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.midigame.videoapp.data.TrackUiModel;
import com.midigame.videoapp.presenter.callbacks.OnItemClickListener;
import com.midigame.videoapp.ui.main.BaseAdapter;

import java.util.List;

public class ListVideoAdapter extends BaseAdapter<TrackUiModel, ListVideoViewHolder> {

    public ListVideoAdapter(List<TrackUiModel> list, OnItemClickListener onItemClick) {
        super(list, onItemClick);
    }

    @NonNull
    @Override
    public ListVideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ListVideoViewHolder(viewGroup, onItemClickListener);
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }
}

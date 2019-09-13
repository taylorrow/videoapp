package com.midigame.videoapp.ui.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.midigame.videoapp.R;
import com.midigame.videoapp.data.TrackUiModel;
import com.midigame.videoapp.presenter.callbacks.OnItemClickListener;
import com.midigame.videoapp.ui.main.BaseViewHolder;

public class ListVideoViewHolder extends BaseViewHolder<TrackUiModel> implements View.OnClickListener {

    private OnItemClickListener onItemClickListener;
    private TextView title;
    private TrackUiModel model;

    ListVideoViewHolder(ViewGroup viewGroup, OnItemClickListener onClick) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false));
        onItemClickListener = onClick;
        itemView.setOnClickListener(this);
        initView();
    }

    @Override
    public void onClick(View view) {
        onItemClickListener.onItemClick(model.trackName, model.trackNumber);
    }

    @Override
    public void onBind(TrackUiModel model) {
        this.model = model;
        title.setText(model.trackName + model.trackNumber);
    }

    private void initView() {
        title = itemView.findViewById(R.id.textViewTitle);
        ;
    }
}

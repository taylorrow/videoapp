package com.midigame.videoapp.ui.main;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View view) {
        super(view);
    }

    public abstract void onBind(T model);
}

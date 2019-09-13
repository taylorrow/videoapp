package com.midigame.videoapp.ui.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.midigame.videoapp.presenter.callbacks.OnItemClickListener;

import java.util.List;

public abstract class BaseAdapter<T, V extends BaseViewHolder<T>> extends RecyclerView.Adapter<V> {

    protected List<T> list;
    protected OnItemClickListener onItemClickListener;

    public BaseAdapter(List<T> list, OnItemClickListener onItemClick) {
        this.list = list;
        onItemClickListener = onItemClick;
    }

    @Override
    public void onBindViewHolder(@NonNull V holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public abstract int getItemViewType(int position);

    @Override
    public int getItemCount() {
        return list == null || list.isEmpty() ? 0 : list.size();
    }

    public void setList(List<T> list) {
        this.list = list;
        notifyDataSetChanged();
    }
}

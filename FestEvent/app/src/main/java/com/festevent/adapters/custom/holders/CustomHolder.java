package com.festevent.adapters.custom.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

public class CustomHolder extends RecyclerView.ViewHolder {
    private List<View> views;
    private int         type;

    public CustomHolder(View itemView) {
        super(itemView);
    }

    public List<View> getViews() {
        return views;
    }

    public void setViews(List<View> views) {
        this.views = views;
    }
}

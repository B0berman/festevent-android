package com.festevent.adapters.custom;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.festevent.R;
import com.festevent.adapters.custom.holders.CustomHolder;
import com.festevent.adapters.custom.holders.FriendHolder;
import com.festevent.beans.User;

import java.util.List;

/**
 * Created by walbecq on 22/04/18.
 */

public class CustomRecyclerAdapter<T> extends RecyclerView.Adapter<CustomHolder> {

    private final Activity activity;
    private List<T> data;
    private boolean updateEnable = true;

    public CustomRecyclerAdapter(Activity context, List<T> list) {
        activity = context;
        data = list;
    }

    public List<T> getCurrentContent() {
        return data;
    }

    public void updateContent(List<T> data) {
        if (updateEnable) {
            this.data = data;
            notifyDataSetChanged();
        }
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_item, parent, false);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = ((RecyclerView) view.getParent()).getChildLayoutPosition(view);

                // start activity
            }
        });
        return new CustomHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        if (data.get(position).getClass().isInstance(User.class))
            return 0;

        // Just as an example, return 0 or 2 depending on position
        // Note that unlike in ListView adapters, types don't have to be contiguous
        if (position == 0)
            return 0;
        return 1;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public boolean isUpdateEnable() {
        return updateEnable;
    }

    public void setUpdateEnable(boolean updateEnable) {
        this.updateEnable = updateEnable;
    }

}

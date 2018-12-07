package com.festevent.adapters.custom.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.festevent.R;

public class FriendHolder extends RecyclerView.ViewHolder {
    public ImageView imageFriend;
    public TextView nameFriend;
    public TextView  commonNumberFriends;

    public FriendHolder(View itemView) {
        super(itemView);

        imageFriend = itemView.findViewById(R.id.friend_image_view);
        nameFriend = itemView.findViewById(R.id.friend_name_view);
        commonNumberFriends = itemView.findViewById(R.id.friend_commons_view);
    }
}
package com.festevent.adapters.custom.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.festevent.R;

public class CommentHolder extends RecyclerView.ViewHolder {
    public ImageView commenterImageView;
    public TextView commenterNameView;
    public TextView  commentContentView;

    public CommentHolder(View itemView) {
        super(itemView);

        commenterImageView = itemView.findViewById(R.id.commenter_image_view);
        commenterNameView = itemView.findViewById(R.id.commenterNameView);
        commentContentView = itemView.findViewById(R.id.commentContentView);
    }
}

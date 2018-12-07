package com.festevent.adapters.custom.holders;

import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.festevent.R;

public class NewCommentHolder extends RecyclerView.ViewHolder {
    public AppCompatImageButton sendButton;
    public EditText commentContent;
    public ImageView commenterImageView;

    public NewCommentHolder(View itemView) {
        super(itemView);

        commenterImageView = itemView.findViewById(R.id.new_comment_image_view);
        commentContent = itemView.findViewById(R.id.new_comment_content_view);
        sendButton = itemView.findViewById(R.id.send_comment_button);
    }
}

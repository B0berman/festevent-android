package com.festevent.adapters.custom.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.festevent.R;

public class PublicationHolder extends RecyclerView.ViewHolder {
    public ImageView imagePublication;
    public ImageView imagePublisher;
    public TextView namePublisher;
    public TextView  publicationContent;
    public ImageView    commentButton;
    public ImageView    likeButton;
    public RecyclerView commentsView;

    public PublicationHolder(View itemView) {
        super(itemView);

        likeButton = itemView.findViewById(R.id.button_like);
        commentsView = itemView.findViewById(R.id.comment_recycler_view);
        imagePublication = itemView.findViewById(R.id.publicationImageView);
        imagePublisher = itemView.findViewById(R.id.publisher_image_view);
        publicationContent = itemView.findViewById(R.id.publicationContentView);
        namePublisher = itemView.findViewById(R.id.publisherNameView);
        commentButton = itemView.findViewById(R.id.comment_button);
    }
}

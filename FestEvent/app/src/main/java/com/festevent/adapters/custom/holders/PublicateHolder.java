package com.festevent.adapters.custom.holders;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.festevent.R;

public class PublicateHolder extends RecyclerView.ViewHolder {
    public CardView publicateCard;

    public PublicateHolder(View itemView) {
        super(itemView);

        publicateCard = itemView.findViewById(R.id.publicate_card);
    }
}

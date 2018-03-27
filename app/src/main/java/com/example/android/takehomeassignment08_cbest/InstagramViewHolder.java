package com.example.android.takehomeassignment08_cbest;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class InstagramViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public TextView username;
        public TextView postUsername;
        public TextView postInfo;
        public ImageView newPost;

        public InstagramViewHolder(View itemView, final Context context) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            username = (TextView) itemView.findViewById(R.id.username);
            postUsername = (TextView) itemView.findViewById(R.id.post_username);
            newPost = (ImageView) itemView.findViewById(R.id.new_post);
            postInfo = (TextView) itemView.findViewById(R.id.post_info);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, postInfo.getText(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }


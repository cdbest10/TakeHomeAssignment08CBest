package com.example.android.takehomeassignment08_cbest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramViewHolder> {

    private List<Instagram> instaposts;
    private Context context;

    public InstagramAdapter(List<Instagram> instaposts, Context context) {
        this.instaposts = instaposts;
        this.context = context;
    }

    @Override
    public InstagramViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_instagram, parent, false);
        return new InstagramViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(InstagramViewHolder holder, int position) {
        Instagram insta = instaposts.get(position);
        holder.username.setText(insta.username);
        holder.postUsername.setText(insta.username);
        holder.newPost.setImageResource(insta.photoId);
        holder.postInfo.setText(insta.postInfo);
    }

    @Override
    public int getItemCount() {
        return instaposts.size();
    }

}

/*  cardView = (CardView) itemView.findViewById(R.id.card_view);
        username = (TextView) itemView.findViewById(R.id.username);
        postUsername = (TextView) itemView.findViewById(R.id.post_username);
        newPost = (ImageView) itemView.findViewById(R.id.new_post);
        postInfo = (TextView) itemView.findViewById(R.id.post_info);*/
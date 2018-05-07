package com.example.jiwon.wimbledone;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Yoon's proj3 Card-View Implementation of Landmarks
 * Used as a template for matched players.
 */
public class PlayerMatchAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private ArrayList<PlayerMatch> mPlayerMatches;
    private RecyclerView.ViewHolder holder;
    private int position;

    public PlayerMatchAdapter(Context context, ArrayList<PlayerMatch> PlayerMatches) {
        mContext = context;
        mPlayerMatches = PlayerMatches;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.playermatch, parent, false);
        return new PlayerMatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        this.holder = holder;
        this.position = position;
        PlayerMatch playerMatch = mPlayerMatches.get(position);
        ((PlayerMatchViewHolder) holder).bind(playerMatch);
    }

    @Override
    public int getItemCount() {
        return mPlayerMatches.size();
    }
}

class PlayerMatchViewHolder extends RecyclerView.ViewHolder {
    public LinearLayout mPlayerMatchLayout;
    public ImageView mImageView;
    public TextView mNameTextView;
    public TextView mDistanceTextView;

    public PlayerMatchViewHolder(View itemView) {
        super(itemView);
        mPlayerMatchLayout = itemView.findViewById(R.id.match_cell_layout);
        mImageView = mPlayerMatchLayout.findViewById(R.id.image);
        mNameTextView = mPlayerMatchLayout.findViewById(R.id.name);
        mDistanceTextView = mPlayerMatchLayout.findViewById(R.id.distance);
    }

    void bind(PlayerMatch mPlayerMatch) {
        setImageResources(mPlayerMatch.name);
        mNameTextView.setText(mPlayerMatch.name);
        mDistanceTextView.setText(String.valueOf(mPlayerMatch.distance));
    }

    private void setImageResources(String name) {
        Random rand = new Random();
        int value = rand.nextInt(50);
        if (value < 12.5) {
            mImageView.setImageResource(R.drawable.tennis_player);
        } else if (value >= 12.5 && value < 25) {
            mImageView.setImageResource(R.drawable.tennis_player_2);
        } else if (value >= 25 && value < 37.5) {
            mImageView.setImageResource(R.drawable.tennis_player_3);
        } else {
            mImageView.setImageResource(R.drawable.tennis_player_4);
        }
    }
}

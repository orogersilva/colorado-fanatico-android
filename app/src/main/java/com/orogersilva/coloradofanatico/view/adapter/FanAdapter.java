package com.orogersilva.coloradofanatico.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.orogersilva.coloradofanatico.R;
import com.orogersilva.coloradofanatico.vo.Fan;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by orogersilva on 2/1/2016.
 */
public class FanAdapter extends RecyclerView.Adapter<FanAdapter.ViewHolder> {

    // region FIELDS

    private List<Fan> mFans;

    // endregion

    // region CONSTRUCTORS

    public FanAdapter(List<Fan> fans) {

        mFans = fans;
    }

    // endregion

    // region OVERRIDED METHODS

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dataitem_fan, parent, false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Fan fan = mFans.get(position);

        // TODO: 2/2/2016 Search how to set the ImageView.
        holder.mFullNameTextView.setText(fan.getFullName());
        holder.mQuantityCheckinTextView.setText(String.valueOf(fan.getQuantityCheckin()));
    }

    @Override
    public int getItemCount() {

        return mFans.size();
    }

    // endregion

    // region HOLDERS

    public static class ViewHolder extends RecyclerView.ViewHolder {

        // region FIELDS

        @Bind(R.id.fan_imageview)
        ImageView mFanImageView;
        @Bind(R.id.fullname_textview)
        TextView mFullNameTextView;
        @Bind(R.id.quantity_checkin_textview)
        TextView mQuantityCheckinTextView;

        // endregion

        // region CONSTRUCTORS

        public ViewHolder(View itemView) {

            super(itemView);

            ButterKnife.bind(this, itemView);
        }

        // endregion
    }

    // endregion
}

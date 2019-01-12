package com.devschema.sh4d0w.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    private boolean isList = true;

    static class Holder {
        TextView title;
        TextView location;
        ImageView img;
    }

    public ItemAdapter(Context context, ArrayList<Item> mData) {
        super(context, 0, mData);
        this.isList = true;
    }

    public ItemAdapter(Context context, ArrayList<Item> mData, boolean status) {
        super(context, 0, mData);
        this.isList = status;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (this.isList) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }
            Item currentItem = getItem(position);
            Holder holder = new Holder();
            holder.title = convertView.findViewById(R.id.title);
            holder.title.setText(currentItem.getItemTitle());
            holder.location = convertView.findViewById(R.id.location);
            holder.location.setText(currentItem.getItemLocation());
            holder.img = convertView.findViewById(R.id.image);
            holder.img.setImageResource(currentItem.getItemImageResourceId());
            showReviewStar(convertView, currentItem.getItemReviewStar());
            return convertView;
        } else {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
            }
            Item currentItem = getItem(position);
            Holder holder = new Holder();
            holder.title = convertView.findViewById(R.id.grid_text);
            holder.title.setText(currentItem.getItemTitle());
            holder.img = convertView.findViewById(R.id.grid_image);
            holder.img.setImageResource(currentItem.getItemImageResourceId());
            return convertView;
        }

    }

    private void showReviewStar(View listview, int star) {
        ImageView imageViewStart1 = listview.findViewById(R.id.review_star1);
        ImageView imageViewStart2 = listview.findViewById(R.id.review_star2);
        ImageView imageViewStart3 = listview.findViewById(R.id.review_star3);
        ImageView imageViewStart4 = listview.findViewById(R.id.review_star4);
        ImageView imageViewStart5 = listview.findViewById(R.id.review_star5);
        switch (star) {
            case 1:
                imageViewStart1.setImageResource(R.drawable.ic_star_filled);
                imageViewStart2.setImageResource(R.drawable.ic_star_border);
                imageViewStart3.setImageResource(R.drawable.ic_star_border);
                imageViewStart4.setImageResource(R.drawable.ic_star_border);
                imageViewStart5.setImageResource(R.drawable.ic_star_border);
                break;

            case 2:
                imageViewStart1.setImageResource(R.drawable.ic_star_filled);
                imageViewStart2.setImageResource(R.drawable.ic_star_filled);
                imageViewStart3.setImageResource(R.drawable.ic_star_border);
                imageViewStart4.setImageResource(R.drawable.ic_star_border);
                imageViewStart5.setImageResource(R.drawable.ic_star_border);
                break;
            case 3:
                imageViewStart1.setImageResource(R.drawable.ic_star_filled);
                imageViewStart2.setImageResource(R.drawable.ic_star_filled);
                imageViewStart3.setImageResource(R.drawable.ic_star_filled);
                imageViewStart4.setImageResource(R.drawable.ic_star_border);
                imageViewStart5.setImageResource(R.drawable.ic_star_border);
                break;
            case 4:
                imageViewStart1.setImageResource(R.drawable.ic_star_filled);
                imageViewStart2.setImageResource(R.drawable.ic_star_filled);
                imageViewStart3.setImageResource(R.drawable.ic_star_filled);
                imageViewStart4.setImageResource(R.drawable.ic_star_filled);
                imageViewStart5.setImageResource(R.drawable.ic_star_border);
                break;
            case 5:
                imageViewStart1.setImageResource(R.drawable.ic_star_filled);
                imageViewStart2.setImageResource(R.drawable.ic_star_filled);
                imageViewStart3.setImageResource(R.drawable.ic_star_filled);
                imageViewStart4.setImageResource(R.drawable.ic_star_filled);
                imageViewStart5.setImageResource(R.drawable.ic_star_filled);
                break;
            default:
                imageViewStart1.setImageResource(R.drawable.ic_star_border);
                imageViewStart2.setImageResource(R.drawable.ic_star_border);
                imageViewStart3.setImageResource(R.drawable.ic_star_border);
                imageViewStart4.setImageResource(R.drawable.ic_star_border);
                imageViewStart5.setImageResource(R.drawable.ic_star_border);
                break;
        }
    }
}

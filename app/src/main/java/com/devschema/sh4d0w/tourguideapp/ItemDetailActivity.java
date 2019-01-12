package com.devschema.sh4d0w.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ItemDetailActivity extends AppCompatActivity {
    final ArrayList<Item> mItems = new ArrayList<Item>();
    @BindView(R.id.itemImg)
    ImageView itemImg;
    @BindView(R.id.itemTitle)
    TextView itemTitle;
    @BindView(R.id.itemLocation)
    TextView itemLocation;
    @BindView(R.id.itemProvider)
    TextView itemProvider;
    @BindView(R.id.itemHightlights)
    TextView itemHightlights;
    @BindView(R.id.itemOverview)
    TextView itemOverview;
    @BindView(R.id.itemPrice)
    TextView itemPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        Item currentItem = (Item) intent.getSerializableExtra("currentItem");
        itemImg.setImageResource(currentItem.getItemImageResourceId());
        itemTitle.setText(currentItem.getItemTitle());
        itemLocation.setText(currentItem.getItemLocation());
        itemProvider.setText(currentItem.getItemProvider());
        String[] highlights = currentItem.getItemHighlights();
        String highlightsText = "";
        for (int i = 0; i < highlights.length; i++)
            highlightsText += "* " + highlights[i] + "\n\n";
        itemHightlights.setText(highlightsText);
        itemOverview.setText(currentItem.getItemOverview());
        int price = (int) currentItem.getItemPrice();
        String priceText = "";
        if (price == 0)
            priceText = "";
        else
            priceText = String.valueOf("$" + currentItem.getItemPrice());
        itemPrice.setText(priceText);


    }
}

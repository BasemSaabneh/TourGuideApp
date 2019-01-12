package com.devschema.sh4d0w.tourguideapp;

import java.io.Serializable;

public class Item implements Serializable {
    private int Id;
    private String itemTitle;
    private String itemLocation;
    private int itemReviewStar;
    private int itemImageResourceId;
    private String[] itemHighlights;
    private String itemOverview;
    private String itemProvider;
    private float itemPrice;

    public Item() {
    }
    public Item(String itemTitle,int itemImageResourceId) {
        this.itemTitle = itemTitle;
        this.itemImageResourceId = itemImageResourceId;
    }
    public Item(String itemTitle, String itemLocation, int itemReviewStar, int itemImageResourceId) {
        this.itemTitle = itemTitle;
        this.itemLocation = itemLocation;
        this.itemReviewStar = itemReviewStar;
        this.itemImageResourceId = itemImageResourceId;
    }

    public Item(String itemTitle, String itemLocation, int itemReviewStar, int itemImageResourceId, String[] itemHighlights, String itemOverview) {
        this.itemTitle = itemTitle;
        this.itemLocation = itemLocation;
        this.itemReviewStar = itemReviewStar;
        this.itemImageResourceId = itemImageResourceId;
        this.itemHighlights = itemHighlights;
        this.itemOverview = itemOverview;
    }

    public Item(String itemTitle, String itemLocation, int itemReviewStar, int itemImageResourceId, String[] itemHighlights, String itemOverview, String itemProvider, float itemPrice) {
        this.itemTitle = itemTitle;
        this.itemLocation = itemLocation;
        this.itemReviewStar = itemReviewStar;
        this.itemImageResourceId = itemImageResourceId;
        this.itemHighlights = itemHighlights;
        this.itemOverview = itemOverview;
        this.itemProvider = itemProvider;
        this.itemPrice = itemPrice;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public int getItemReviewStar() {
        return itemReviewStar;
    }

    public int getItemImageResourceId() {
        return itemImageResourceId;
    }

    public String[] getItemHighlights() {
        return itemHighlights;
    }

    public String getItemOverview() {
        return itemOverview;
    }

    public String getItemProvider() {
        return itemProvider;
    }

    public float getItemPrice() {
        return itemPrice;
    }
}


package com.devschema.sh4d0w.tourguideapp;

import android.content.Context;

import java.util.ArrayList;

public class DataGenerator {
    private Context context;
    private ArrayList<Item> mItems = new ArrayList<Item>();

    public DataGenerator() {

    }

    public DataGenerator(Context context) {
        this.context = context;
    }

    public ArrayList<Item> InitFoods() {
        mItems.add(new Item(
                context.getString(R.string.food_falafel),
                context.getString(R.string.food_falafel_location),
                Integer.parseInt(context.getResources().getString(R.string.food_falafel_Reviews)),
                R.drawable.food_falafel,
                context.getResources().getStringArray(R.array.food_falafel_highlights),
                context.getString(R.string.food_falafel_overview),
                context.getString(R.string.food_falafel_provider),
                Float.parseFloat(context.getString(R.string.food_falafel_price))
        ));
        mItems.add(new Item(
                context.getString(R.string.food_musakhan),
                context.getString(R.string.food_musakhan_location),
                Integer.parseInt(context.getString(R.string.food_musakhan_Reviews)),
                R.drawable.food_musakhan,
                context.getResources().getStringArray(R.array.food_musakhan_highlights),
                context.getString(R.string.food_musakhan_overview),
                context.getString(R.string.food_musakhan_provider),
                Float.parseFloat(context.getString(R.string.food_falafel_price))
        ));
        mItems.add(new Item(
                context.getString(R.string.food_maqluba),
                context.getString(R.string.food_maqluba_location),
                Integer.parseInt(context.getString(R.string.food_maqluba_Reviews)),
                R.drawable.food_maqluba,
                context.getResources().getStringArray(R.array.food_maqluba_highlights),
                context.getString(R.string.food_maqluba_overview),
                context.getString(R.string.food_maqluba_provider),
                Float.parseFloat(context.getString(R.string.food_maqluba_price))
        ));
        mItems.add(new Item(
                context.getString(R.string.food_kanafeh),
                context.getString(R.string.food_kanafeh_location),
                Integer.parseInt(context.getString(R.string.food_kanafeh_Reviews)),
                R.drawable.food_kanafeh,
                context.getResources().getStringArray(R.array.food_kanafeh_highlights),
                context.getString(R.string.food_kanafeh_overview),
                context.getString(R.string.food_kanafeh_provider),
                Float.parseFloat(context.getString(R.string.food_kanafeh_price))
        ));
        mItems.add(new Item(
                context.getString(R.string.food_qatayef),
                context.getString(R.string.food_qatayef_location),
                Integer.parseInt(context.getString(R.string.food_qatayef_Reviews)),
                R.drawable.food_qatayef,
                context.getResources().getStringArray(R.array.food_qatayef_highlights),
                context.getString(R.string.food_qatayef_overview),
                context.getString(R.string.food_qatayef_provider),
                Float.parseFloat(context.getString(R.string.food_qatayef_price))
        ));
        return mItems;
    }

    public ArrayList<Item> InitHoly() {
        mItems.add(new Item(
                context.getString(R.string.holy_aqsa),
                context.getString(R.string.holy_aqsa_location),
                Integer.parseInt(context.getResources().getString(R.string.holy_aqsa_Reviews)),
                R.drawable.holy_aqsa,
                context.getResources().getStringArray(R.array.holy_aqsa_highlights),
                context.getString(R.string.holy_aqsa_overview)
        ));
        mItems.add(new Item(
                context.getString(R.string.holy_sepulchre),
                context.getString(R.string.holy_sepulchre_location),
                Integer.parseInt(context.getResources().getString(R.string.holy_sepulchre_Reviews)),
                R.drawable.holy_sepulchre,
                context.getResources().getStringArray(R.array.holy_sepulchre_highlights),
                context.getString(R.string.holy_sepulchre_overview)
        ));
        mItems.add(new Item(
                context.getString(R.string.holy_nativity),
                context.getString(R.string.holy_nativity_location),
                Integer.parseInt(context.getResources().getString(R.string.holy_nativity_Reviews)),
                R.drawable.holy_nativity,
                context.getResources().getStringArray(R.array.holy_nativity_highlights),
                context.getString(R.string.holy_nativity_overview)
        ));
        mItems.add(new Item(
                context.getString(R.string.holy_dom),
                context.getString(R.string.holy_dom_location),
                Integer.parseInt(context.getResources().getString(R.string.holy_dom_Reviews)),
                R.drawable.holy_dom,
                context.getResources().getStringArray(R.array.holy_dom_highlights),
                context.getString(R.string.holy_dom_overview)
        ));
        mItems.add(new Item(
                context.getString(R.string.holy_baha),
                context.getString(R.string.holy_baha_location),
                Integer.parseInt(context.getResources().getString(R.string.holy_baha_Reviews)),
                R.drawable.holy_baha,
                context.getResources().getStringArray(R.array.holy_baha_highlights),
                context.getString(R.string.holy_baha_overview)
        ));
        return mItems;
    }

    public ArrayList<Item> InitCities() {
        mItems.add(new Item(
                context.getString(R.string.city_jerusalem),
                context.getString(R.string.city_jerusalem_location),
                Integer.parseInt(context.getResources().getString(R.string.city_jerusalem_Reviews)),
                R.drawable.city_jerusalem,
                context.getResources().getStringArray(R.array.city_jerusalem_highlights),
                context.getString(R.string.city_jerusalem_overview))
        );
        mItems.add(new Item(
                context.getString(R.string.city_ramallah),
                context.getString(R.string.city_ramallah_location),
                Integer.parseInt(context.getResources().getString(R.string.city_ramallah_Reviews)),
                R.drawable.city_ramallah,
                context.getResources().getStringArray(R.array.city_ramallah_highlights),
                context.getString(R.string.city_ramallah_overview))
        );
        mItems.add(new Item(
                context.getString(R.string.city_gaza),
                context.getString(R.string.city_gaza_location),
                Integer.parseInt(context.getResources().getString(R.string.city_gaza_Reviews)),
                R.drawable.city_gaza,
                context.getResources().getStringArray(R.array.city_gaza_highlights),
                context.getString(R.string.city_gaza_overview))
        );
        mItems.add(new Item(
                context.getString(R.string.city_acre),
                context.getString(R.string.city_acre_location),
                Integer.parseInt(context.getResources().getString(R.string.city_acre_Reviews)),
                R.drawable.city_akka,
                context.getResources().getStringArray(R.array.city_acre_highlights),
                context.getString(R.string.city_acre_overview))
        );
        mItems.add(new Item(
                context.getString(R.string.city_jaffa),
                context.getString(R.string.city_jaffa_location),
                Integer.parseInt(context.getResources().getString(R.string.city_jaffa_Reviews)),
                R.drawable.city_yaffa,
                context.getResources().getStringArray(R.array.city_jaffa_highlights),
                context.getString(R.string.city_jaffa_overview))
        );
        mItems.add(new Item(
                context.getString(R.string.city_haifa),
                context.getString(R.string.city_haifa_location),
                Integer.parseInt(context.getResources().getString(R.string.city_haifa_Reviews)),
                R.drawable.city_haifa,
                context.getResources().getStringArray(R.array.city_haifa_highlights),
                context.getString(R.string.city_haifa_overview))
        );
        mItems.add(new Item(
                context.getString(R.string.city_nablus),
                context.getString(R.string.city_nablus_location),
                Integer.parseInt(context.getResources().getString(R.string.city_nablus_Reviews)),
                R.drawable.city_nablus,
                context.getResources().getStringArray(R.array.city_nablus_highlights),
                context.getString(R.string.city_nablus_overview))
        );
        mItems.add(new Item(
                context.getString(R.string.city_jenin),
                context.getString(R.string.city_jenin_location),
                Integer.parseInt(context.getResources().getString(R.string.city_jenin_Reviews)),
                R.drawable.city_jenin,
                context.getResources().getStringArray(R.array.city_jenin_highlights),
                context.getString(R.string.city_jenin_overview))
        );
        return mItems;
    }

    public ArrayList<Item> InitHeritage() {
        mItems.add(new Item(
                context.getString(R.string.heritage_woman),
                R.drawable.heritage_woman
        ));
        mItems.add(new Item(
                context.getString(R.string.heritage_bedouin),
                R.drawable.heritage_bedouin
        ));
        mItems.add(new Item(
                context.getString(R.string.heritage_majdali),
                R.drawable.heritage_majdali
        ));
        mItems.add(new Item(
                context.getString(R.string.heritage_village),
                R.drawable.heritage_village
        ));
        mItems.add(new Item(
                context.getString(R.string.heritage_dress),
                R.drawable.heritage_dress
        ));
        mItems.add(new Item(
                context.getString(R.string.heritage_stitch),
                R.drawable.heritage_stitch
        ));
        mItems.add(new Item(
                context.getString(R.string.heritage_wedding),
                R.drawable.heritage_wedding
        ));
        return mItems;
    }

    public ArrayList<Item> InitMap() {
        mItems.add(new Item(
                context.getString(R.string.map_1916),
                R.drawable.map_1916
        ));
        mItems.add(new Item(
                context.getString(R.string.map_1937),
                R.drawable.map_1937
        ));
        mItems.add(new Item(
                context.getString(R.string.map_1947),
                R.drawable.map_1947
        ));
        mItems.add(new Item(
                context.getString(R.string.map_1947_2),
                R.drawable.map_1947_2
        ));
        mItems.add(new Item(
                context.getString(R.string.map_1948),
                R.drawable.map_1948
        ));
        mItems.add(new Item(
                context.getString(R.string.map_1967),
                R.drawable.map_1967
        ));
        mItems.add(new Item(
                context.getString(R.string.map_1994),
                R.drawable.map_1994
        ));
        mItems.add(new Item(
                context.getString(R.string.map_2006),
                R.drawable.map_2006
        ));
        return mItems;
    }
}

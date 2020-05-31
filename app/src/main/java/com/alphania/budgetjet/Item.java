package com.alphania.budgetjet;

public class Item {
    private String mBrand;
    private String mCategory;
    private String mPriceRanges;
    private String mImageUrl;
    private String mSellers;
    private String mImageCaption;

    public Item(String mBrand, String mCategory, String mPriceRanges, String mImageUrl, String mSellers, String mImageCaption) {
        this.mBrand = mBrand;
        this.mCategory = mCategory;
        this.mPriceRanges = mPriceRanges;
        this.mImageUrl = mImageUrl;
        this.mSellers = mSellers;
        this.mImageCaption = mImageCaption;
    }

    public String getmBrand() {
        return mBrand;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmPriceRanges() {
        return mPriceRanges;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmSellers() {
        return mSellers;
    }

    public String getmImageCaption() {
        return mImageCaption;
    }
}

package com.alphania.budgetjet;

public class Item {
    private String mBrand;
    private String mCategory;
    private String mPriceRanges;
    private String mImageUrl;
    private String mSellers;
    private String mCaption;

    public Item(String Brand, String Category, String PriceRange, String ImageUrl , String Caption, String Sellers) {
        this.mBrand = Brand;
        this.mCategory = Category;
        this.mPriceRanges = PriceRange;
        this.mImageUrl = ImageUrl;
        this.mCaption = Caption;
        this.mSellers = Sellers;
        mImageUrl = getLargeImageUrl(ImageUrl);
    }
    private String getLargeImageUrl(String imageUrl) {
        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 6).concat("o.jpg");
        return largeImageUrl;
    }

    public String getBrand() {
        return mBrand;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getPriceRanges() {
        return mPriceRanges;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getSellers() {
        return mSellers;
    }

    public String getCaption() {
        return mCaption;
    }
}

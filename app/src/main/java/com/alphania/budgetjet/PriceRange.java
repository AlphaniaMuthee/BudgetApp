
package com.alphania.budgetjet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceRange {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("maximumPrice")
    @Expose
    private Integer maximumPrice;
    @SerializedName("maximumPriceString")
    @Expose
    private String maximumPriceString;
    @SerializedName("minimumPrice")
    @Expose
    private Double minimumPrice;
    @SerializedName("minimumPriceString")
    @Expose
    private String minimumPriceString;
    @SerializedName("productCount")
    @Expose
    private Integer productCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PriceRange() {
    }

    /**
     * 
     * @param maximumPriceString
     * @param maximumPrice
     * @param minimumPriceString
     * @param id
     * @param minimumPrice
     * @param productCount
     */
    public PriceRange(String id, Integer maximumPrice, String maximumPriceString, Double minimumPrice, String minimumPriceString, Integer productCount) {
        super();
        this.id = id;
        this.maximumPrice = maximumPrice;
        this.maximumPriceString = maximumPriceString;
        this.minimumPrice = minimumPrice;
        this.minimumPriceString = minimumPriceString;
        this.productCount = productCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMaximumPrice() {
        return maximumPrice;
    }

    public void setMaximumPrice(Integer maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    public String getMaximumPriceString() {
        return maximumPriceString;
    }

    public void setMaximumPriceString(String maximumPriceString) {
        this.maximumPriceString = maximumPriceString;
    }

    public Double getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(Double minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public String getMinimumPriceString() {
        return minimumPriceString;
    }

    public void setMinimumPriceString(String minimumPriceString) {
        this.minimumPriceString = minimumPriceString;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

}

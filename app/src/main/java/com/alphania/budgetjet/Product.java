
package com.alphania.budgetjet;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;
    @SerializedName("maximumBv")
    @Expose
    private Double maximumBv;
    @SerializedName("maximumCashback")
    @Expose
    private Double maximumCashback;
    @SerializedName("maximumCashbackString")
    @Expose
    private String maximumCashbackString;
    @SerializedName("maximumCiPoints")
    @Expose
    private Integer maximumCiPoints;
    @SerializedName("maximumIbv")
    @Expose
    private Integer maximumIbv;
    @SerializedName("maximumPrice")
    @Expose
    private Double maximumPrice;
    @SerializedName("maximumPriceString")
    @Expose
    private String maximumPriceString;
    @SerializedName("minimumPrice")
    @Expose
    private Double minimumPrice;
    @SerializedName("minimumPriceString")
    @Expose
    private String minimumPriceString;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("referralUrl")
    @Expose
    private String referralUrl;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param image
     * @param maximumCashbackString
     * @param minimumPriceString
     * @param shortDescription
     * @param maximumIbv
     * @param maximumBv
     * @param maximumPriceString
     * @param maximumCiPoints
     * @param maximumPrice
     * @param referralUrl
     * @param name
     * @param links
     * @param id
     * @param maximumCashback
     * @param minimumPrice
     * @param brand
     */
    public Product(String brand, Integer id, Image image, List<Link> links, Double maximumBv, Double maximumCashback, String maximumCashbackString, Integer maximumCiPoints, Integer maximumIbv, Double maximumPrice, String maximumPriceString, Double minimumPrice, String minimumPriceString, String name, String referralUrl, String shortDescription) {
        super();
        this.brand = brand;
        this.id = id;
        this.image = image;
        this.links = links;
        this.maximumBv = maximumBv;
        this.maximumCashback = maximumCashback;
        this.maximumCashbackString = maximumCashbackString;
        this.maximumCiPoints = maximumCiPoints;
        this.maximumIbv = maximumIbv;
        this.maximumPrice = maximumPrice;
        this.maximumPriceString = maximumPriceString;
        this.minimumPrice = minimumPrice;
        this.minimumPriceString = minimumPriceString;
        this.name = name;
        this.referralUrl = referralUrl;
        this.shortDescription = shortDescription;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Double getMaximumBv() {
        return maximumBv;
    }

    public void setMaximumBv(Double maximumBv) {
        this.maximumBv = maximumBv;
    }

    public Double getMaximumCashback() {
        return maximumCashback;
    }

    public void setMaximumCashback(Double maximumCashback) {
        this.maximumCashback = maximumCashback;
    }

    public String getMaximumCashbackString() {
        return maximumCashbackString;
    }

    public void setMaximumCashbackString(String maximumCashbackString) {
        this.maximumCashbackString = maximumCashbackString;
    }

    public Integer getMaximumCiPoints() {
        return maximumCiPoints;
    }

    public void setMaximumCiPoints(Integer maximumCiPoints) {
        this.maximumCiPoints = maximumCiPoints;
    }

    public Integer getMaximumIbv() {
        return maximumIbv;
    }

    public void setMaximumIbv(Integer maximumIbv) {
        this.maximumIbv = maximumIbv;
    }

    public Double getMaximumPrice() {
        return maximumPrice;
    }

    public void setMaximumPrice(Double maximumPrice) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferralUrl() {
        return referralUrl;
    }

    public void setReferralUrl(String referralUrl) {
        this.referralUrl = referralUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

}

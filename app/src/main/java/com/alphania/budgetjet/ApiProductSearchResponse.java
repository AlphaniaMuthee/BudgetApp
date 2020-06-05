
package com.alphania.budgetjet;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiProductSearchResponse {

    @SerializedName("brands")
    @Expose
    private List<Brand> brands = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("numberOfProducts")
    @Expose
    private Integer numberOfProducts;
    @SerializedName("priceRanges")
    @Expose
    private List<PriceRange> priceRanges = null;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("sellers")
    @Expose
    private List<Seller> sellers = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiProductSearchResponse() {
    }

    /**
     * 
     * @param brands
     * @param numberOfProducts
     * @param priceRanges
     * @param categories
     * @param sellers
     * @param products
     */
    public ApiProductSearchResponse(List<Brand> brands, List<Category> categories, Integer numberOfProducts, List<PriceRange> priceRanges, List<Product> products, List<Seller> sellers) {
        super();
        this.brands = brands;
        this.categories = categories;
        this.numberOfProducts = numberOfProducts;
        this.priceRanges = priceRanges;
        this.products = products;
        this.sellers = sellers;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(Integer numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public List<PriceRange> getPriceRanges() {
        return priceRanges;
    }

    public void setPriceRanges(List<PriceRange> priceRanges) {
        this.priceRanges = priceRanges;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

}


package com.alphania.budgetjet;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("sizes")
    @Expose
    private List<Size> sizes = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param sizes
     * @param caption
     */
    public Image(String caption, List<Size> sizes) {
        super();
        this.caption = caption;
        this.sizes = sizes;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

}

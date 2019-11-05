package org.adobe.business.pojo;

/**
 * @author
 * @date 2019/11/4 19:03
 */
public class Category {

    private Integer categoryId;

    private String categoryName;

    private String categoryDec;

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDec='" + categoryDec + '\'' +
                '}';
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDec() {
        return categoryDec;
    }

    public void setCategoryDec(String categoryDec) {
        this.categoryDec = categoryDec;
    }
}

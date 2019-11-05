package org.adobe.business.pojo;

/**
 * @author
 * @date 2019/11/5 10:33
 */
public class Brand {

    private Integer brandId;

    private String brandName;

    private String brandUrl;

    private String brandLogo;

    private String brandDesc;

    private Integer brandLevel;

    private Boolean brandBool;

    private String brandLink;

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", brandUrl='" + brandUrl + '\'' +
                ", brandLogo='" + brandLogo + '\'' +
                ", brandDesc='" + brandDesc + '\'' +
                ", brandLevel=" + brandLevel +
                ", brandBool=" + brandBool +
                ", brandLink='" + brandLink + '\'' +
                '}';
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandUrl() {
        return brandUrl;
    }

    public void setBrandUrl(String brandUrl) {
        this.brandUrl = brandUrl;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public Integer getBrandLevel() {
        return brandLevel;
    }

    public void setBrandLevel(Integer brandLevel) {
        this.brandLevel = brandLevel;
    }

    public Boolean getBrandBool() {
        return brandBool;
    }

    public void setBrandBool(Boolean brandBool) {
        this.brandBool = brandBool;
    }

    public String getBrandLink() {
        return brandLink;
    }

    public void setBrandLink(String brandLink) {
        this.brandLink = brandLink;
    }
}

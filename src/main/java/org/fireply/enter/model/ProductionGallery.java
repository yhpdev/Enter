package org.fireply.enter.model;
// Generated 2016-5-26 6:45:30 by Hibernate Tools 4.3.1.Final

/**
 * ProductionGallery generated by hbm2java
 */
public class ProductionGallery implements java.io.Serializable {

    private Integer id;
    private Production production;
    private String imageSrc;

    public ProductionGallery() {
    }

    public ProductionGallery(Production production, String imageSrc) {
        this.production = production;
        this.imageSrc = imageSrc;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Production getProduction() {
        return this.production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }

    public String getImageSrc() {
        return this.imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

}

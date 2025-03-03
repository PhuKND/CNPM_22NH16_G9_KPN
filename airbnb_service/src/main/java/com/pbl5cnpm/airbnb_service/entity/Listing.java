package com.pbl5cnpm.airbnb_service.entity;

import java.util.ArrayList;
import java.util.List;

import com.pbl5cnpm.airbnb_service.enums.StatusRoom;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "listings")
public class Listing extends BaseEntity {
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long  Id;
    private String title ;
    @Column(columnDefinition = "TEXT")
    private String descripton;
    private String address;
    private String city;
    private String county;
    private Double price;
    private Double area;
    @Enumerated(EnumType.STRING)
    private StatusRoom status;
    @ManyToOne
    @JoinColumn(name = "host_id", nullable = false) // host_id là khóa ngoại
    private User host;
    
    @ManyToMany
    @JoinTable(
        name = "listing_categories",
        joinColumns = @JoinColumn(name = "listing_id"),
        inverseJoinColumns = @JoinColumn(name = "categorie_id")
    )
    private List<Categories> categories = new ArrayList<>();

    @ManyToMany
    @JoinTable(
        name = "listing_amenites",
        joinColumns = @JoinColumn(name = "listing_id"),
        inverseJoinColumns = @JoinColumn(name = "amenites_id")
    )
    private List<Amenites> amenites = new ArrayList<>();

    @OneToMany(mappedBy = "listing")
    private List<Images> images = new ArrayList<>();

    // getter and setter
    
    
    public Long getId(){
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public StatusRoom getStatus() {
        return status;
    }

    public void setStatus(StatusRoom status) {
        this.status = status;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Amenites> getAmenites() {
        return amenites;
    }

    public void setAmenites(List<Amenites> amenites) {
        this.amenites = amenites;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

}

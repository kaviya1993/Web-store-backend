package mobile.back.demo.search;

import javax.persistence.*;

@Entity
public class MobileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private BrandEntity brand;
    private float primaryCamera;
    private float secondryCam;
    private float prosesorSpeed;
    private float ram;
    private Double price;
    private String url;


    public MobileEntity() {
    }

    public MobileEntity(String name, BrandEntity brand, float primaryCamera, float secondryCam, float prosesorSpeed, float ram, Double price, String url) {
        this.name = name;
        this.brand = brand;
        this.primaryCamera = primaryCamera;
        this.secondryCam = secondryCam;
        this.prosesorSpeed = prosesorSpeed;
        this.ram = ram;
        this.price = price;
        this.url = url;
    }

    public MobileEntity(String name, BrandEntity brand, float primaryCamera, float secondryCam, float prosesorSpeed, float ram, String url) {
        this.name = name;
        this.brand = brand;
        this.primaryCamera = primaryCamera;
        this.secondryCam = secondryCam;
        this.prosesorSpeed = prosesorSpeed;
        this.ram = ram;
        this.url = url;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }

    public float getPrimaryCamera() {
        return primaryCamera;
    }

    public void setPrimaryCamera(float primaryCamera) {
        this.primaryCamera = primaryCamera;
    }

    public float getSecondryCam() {
        return secondryCam;
    }

    public void setSecondryCam(float secondryCam) {
        this.secondryCam = secondryCam;
    }

    public float getProsesorSpeed() {
        return prosesorSpeed;
    }

    public void setProsesorSpeed(float prosesorSpeed) {
        this.prosesorSpeed = prosesorSpeed;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }
}

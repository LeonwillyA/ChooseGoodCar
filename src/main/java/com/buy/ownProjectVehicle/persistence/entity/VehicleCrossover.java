package com.buy.ownProjectVehicle.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "producto_vehiculo")
public class VehicleCrossover {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idProduct;

    @Column(name="marca")
    private String brand;
    @Column(name="modelo")
    private String model;
    @Column(name = "año")
    private Integer year;

    @Column(name = "precio")
    private BigDecimal price;

    @Column(name = "transmision")
    private String transmission;

    @Column(name = "traccion")
    private String traction;

    private String link;

    @Column(name = "fecha_publicacion")
    private LocalDate datePublication;

    @Column(name = "dias_sin_vender")
    private Integer daysWhitoutSell;

    @Column(name = "precio_negociable")
    private Boolean negotiablePrice;

    private Integer ranking;

    @Column(name = "diferencia_precio_nuevo")
    private BigDecimal newDifferentPrice;
    @Column(name = "precio_negociado")
    private BigDecimal amountNegotiablePrice;
    @Column(name = "placa")
    private String plate;

    @Column(name = "kilometraj")
    private Integer kilometer;

    private String status;

    @Column(name = "dinero_faltante")
    private BigDecimal moneyMissing;

    public BigDecimal getMoneyMissing() {
        return moneyMissing;
    }

    public void setMoneyMissing(BigDecimal moneyMissing) {
        this.moneyMissing = moneyMissing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = traction;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public Integer getDaysWhitoutSell() {
        return daysWhitoutSell;
    }

    public void setDaysWhitoutSell(Integer daysWhitoutSell) {
        this.daysWhitoutSell = daysWhitoutSell;
    }

    public Boolean getNegotiablePrice() {
        return negotiablePrice;
    }

    public void setNegotiablePrice(Boolean negotiablePrice) {
        this.negotiablePrice = negotiablePrice;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public BigDecimal getNewDifferentPrice() {
        return newDifferentPrice;
    }

    public void setNewDifferentPrice(BigDecimal newDifferentPrice) {
        this.newDifferentPrice = newDifferentPrice;
    }

    public BigDecimal getAmountNegotiablePrice() {
        return amountNegotiablePrice;
    }

    public void setAmountNegotiablePrice(BigDecimal amountNegotiablePrice) {
        this.amountNegotiablePrice = amountNegotiablePrice;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Integer getKilometer() {
        return kilometer;
    }

    public void setKilometer(Integer kilometer) {
        this.kilometer = kilometer;
    }
}

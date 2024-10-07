package com.buy.ownProjectVehicle.domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class VehicleCrossoverDomain {
    private int productIdDomain;
    private String branDomain;
    private String modelDomain;
    private int yearDomain;
    private BigDecimal priceDomain;
    private String transmissionDomain;
    private String tractionDomain;
    private String linkDomain;
    private LocalDate datePublicationDomain;
    private Integer daysWhitoutSellDomain;
    private Boolean negotiablePriceDomain;
    private Integer rankingDomain;
    private BigDecimal newDifferentPriceDomain;
    private BigDecimal amountNegotiablePriceDomain;
    private String plateDomain;
    private Integer kilometerDomain;
    private String statusDomain;
    private BigDecimal moneyMissingDomain;

    public BigDecimal getMoneyMissingDomain() {
        return moneyMissingDomain;
    }

    public void setMoneyMissingDomain(BigDecimal moneyMissingDomain) {
        this.moneyMissingDomain = moneyMissingDomain;
    }

    public String getStatusDomain() {
        return statusDomain;
    }

    public void setStatusDomain(String statusDomain) {
        this.statusDomain = statusDomain;
    }

    public int getProductIdDomain() {
        return productIdDomain;
    }

    public void setProductIdDomain(int productIdDomain) {
        this.productIdDomain = productIdDomain;
    }

    public String getBranDomain() {
        return branDomain;
    }

    public void setBranDomain(String branDomain) {
        this.branDomain = branDomain;
    }

    public String getModelDomain() {
        return modelDomain;
    }

    public void setModelDomain(String modelDomain) {
        this.modelDomain = modelDomain;
    }

    public int getYearDomain() {
        return yearDomain;
    }

    public void setYearDomain(int yearDomain) {
        this.yearDomain = yearDomain;
    }

    public BigDecimal getPriceDomain() {

        return priceDomain;
    }

    public void setPriceDomain(BigDecimal priceDomain) {
        this.priceDomain = priceDomain;
    }

    public String getTransmissionDomain() {
        return transmissionDomain;
    }

    public void setTransmissionDomain(String transmissionDomain) {
        this.transmissionDomain = transmissionDomain;
    }

    public String getTractionDomain() {
        return tractionDomain;
    }

    public void setTractionDomain(String tractionDomain) {
        this.tractionDomain = tractionDomain;
    }

    public String getLinkDomain() {
        return linkDomain;
    }

    public void setLinkDomain(String linkDomain) {
        this.linkDomain = linkDomain;
    }

    public LocalDate getDatePublicationDomain() {
        return datePublicationDomain;
    }

    public void setDatePublicationDomain(LocalDate datePublicationDomain) {
        this.datePublicationDomain = datePublicationDomain;
    }

    public Integer getDaysWhitoutSellDomain() {
        return daysWhitoutSellDomain;
    }

    public void setDaysWhitoutSellDomain(Integer daysWhitoutSellDomain) {
        this.daysWhitoutSellDomain = daysWhitoutSellDomain;
    }

    public Boolean getNegotiablePriceDomain() {
        return negotiablePriceDomain;
    }

    public void setNegotiablePriceDomain(Boolean negotiablePriceDomain) {
        this.negotiablePriceDomain = negotiablePriceDomain;
    }

    public Integer getRankingDomain() {
        return rankingDomain;
    }

    public void setRankingDomain(Integer rankingDomain) {
        this.rankingDomain = rankingDomain;
    }

    public BigDecimal getNewDifferentPriceDomain() {
        return newDifferentPriceDomain;
    }

    public void setNewDifferentPriceDomain(BigDecimal newDifferentPriceDomain) {
        this.newDifferentPriceDomain = newDifferentPriceDomain;
    }

    public BigDecimal getAmountNegotiablePriceDomain() {
        return amountNegotiablePriceDomain;
    }

    public void setAmountNegotiablePriceDomain(BigDecimal amountNegotiablePriceDomain) {
        this.amountNegotiablePriceDomain = amountNegotiablePriceDomain;
    }

    public String getPlateDomain() {
        return plateDomain;
    }

    public void setPlateDomain(String plateDomain) {
        this.plateDomain = plateDomain;
    }

    public Integer getKilometerDomain() {

        return kilometerDomain;
    }

    public void setKilometerDomain(Integer kilometerDomain) {
        this.kilometerDomain = kilometerDomain;
    }
}

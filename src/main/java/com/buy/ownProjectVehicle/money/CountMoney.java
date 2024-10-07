package com.buy.ownProjectVehicle.money;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class CountMoney {
    private BigDecimal moneyDadBank;
    private BigDecimal moneyAfp;
    private BigDecimal moneyCar;
    private BigDecimal answer;

    public BigDecimal suuma (BigDecimal moneyDadBank, BigDecimal moneyAfp, BigDecimal moneyCar){
        answer = (moneyAfp.add(moneyDadBank).add(moneyCar)).divide(BigDecimal.valueOf(3.75), RoundingMode.HALF_UP);
        return answer;
    }

    public BigDecimal getMoneyDadBank() {
        return moneyDadBank;
    }

    public void setMoneyDadBank(BigDecimal moneyDadBank) {
        this.moneyDadBank = moneyDadBank;
    }

    public BigDecimal getMoneyAfp() {
        return moneyAfp;
    }

    public void setMoneyAfp(BigDecimal moneyAfp) {
        this.moneyAfp = moneyAfp;
    }

    public BigDecimal getMoneyCar() {
        return moneyCar;
    }

    public void setMoneyCar(BigDecimal moneyCar) {
        this.moneyCar = moneyCar;
    }

    public BigDecimal getAnswer() {
        return answer;
    }

    public void setAnswer(BigDecimal answer) {
        this.answer = answer;
    }
}

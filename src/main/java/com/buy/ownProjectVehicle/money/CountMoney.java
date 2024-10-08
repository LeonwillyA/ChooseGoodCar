package com.buy.ownProjectVehicle.money;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class CountMoney {
    private final BigDecimal moneyPepeBank = BigDecimal.valueOf(31000);
    private final BigDecimal moneyAfp = BigDecimal.valueOf(10000);
    private final BigDecimal moneyCar = BigDecimal.valueOf(15000);
    private final BigDecimal moneyPepeCash = BigDecimal.valueOf(20000);
    private final BigDecimal exchangeRate = BigDecimal.valueOf(3.758);
    private BigDecimal answer;

    public BigDecimal suuma (){
        answer = (moneyAfp.add(moneyPepeBank).add(moneyCar).add(moneyPepeCash)).divide(exchangeRate, RoundingMode.HALF_UP);
        return answer;
    }

    public BigDecimal getMoneyPepeCash() {
        return moneyPepeCash;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public BigDecimal getMoneyPepeBank() {
        return moneyPepeBank;
    }

    public BigDecimal getMoneyAfp() {
        return moneyAfp;
    }

    public BigDecimal getMoneyCar() {
        return moneyCar;
    }

    public BigDecimal getAnswer() {
        return answer;
    }

    public void setAnswer(BigDecimal answer) {
        this.answer = answer;
    }
}

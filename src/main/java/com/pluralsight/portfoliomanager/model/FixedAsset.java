package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public abstract class FixedAsset implements Valuable {
    private String name;
    private BigDecimal marketValue;

    public FixedAsset(String name, BigDecimal marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }
//Why don't House, Gold and the others need implements Valuable too? (Hint: what do they extend?)
// I think house gold and others don't need implements bc
    //house and gold extends FixedAsset so maybe they don't need implements since they extend to FixedAsset?
// Is it because it inherits from fixedAsset the getValue method since they both extend FixedAsset?
    @Override
    public BigDecimal getValue() {
        return marketValue;
    }
}

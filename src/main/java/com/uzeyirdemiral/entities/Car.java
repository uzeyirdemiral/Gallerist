package com.uzeyirdemiral.entities;

import com.uzeyirdemiral.enums.CarStatusType;
import com.uzeyirdemiral.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car extends BaseEntity {

    @Column(name = "plaka")
    private String plaka;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "production_year")
    private Integer productionYear;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "currency_type")
    @Enumerated(value = EnumType.STRING)
    private CurrencyType currencyType;
    @Column(name = "damage_price")
    private BigDecimal damagePrice;
    @Column(name = "car_status_type")
    @Enumerated(value = EnumType.STRING)
    private CarStatusType carStatusType;
}

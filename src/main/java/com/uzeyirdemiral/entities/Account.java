package com.uzeyirdemiral.entities;

import com.uzeyirdemiral.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "account")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account extends BaseEntity {

    @Column(name = "account_no")
    private String accountNo;
    @Column(name = "iban")
    private String iban;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "currency_type")
    @Enumerated(value = EnumType.STRING)
    private CurrencyType currencyType;

}

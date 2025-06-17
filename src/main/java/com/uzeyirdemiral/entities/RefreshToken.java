package com.uzeyirdemiral.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "refresh_token")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RefreshToken extends BaseEntity {

    @Column(name = "refresh_token")
    private String refreshToken;
    @Column(name = "expired_date")
    private Date expiredDate;
    @ManyToOne
    private User user;
}

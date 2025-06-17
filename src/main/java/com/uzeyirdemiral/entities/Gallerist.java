package com.uzeyirdemiral.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gallerist")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Gallerist extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToOne
    private Address address;
}

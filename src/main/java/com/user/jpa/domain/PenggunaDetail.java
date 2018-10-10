package com.user.jpa.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PenggunaDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nama;
    private String alamat;
    private String email;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "penggunaId", referencedColumnName = "id", updatable = true)
    private Pengguna pengguna;
}

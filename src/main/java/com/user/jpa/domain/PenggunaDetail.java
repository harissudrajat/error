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

    @OneToOne
    @JoinColumn(name = "penggunaId", referencedColumnName = "id", updatable = false)
    private Pengguna pengguna;
}

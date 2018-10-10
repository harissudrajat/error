package com.user.jpa.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
public class Pengguna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @Column(columnDefinition = "int(2) default '1'")
    private Integer active;

    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createAt;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pengguna")
    @JoinColumn(name = "detailId", referencedColumnName = "id", updatable = true)
    private PenggunaDetail penggunaDetail;
}

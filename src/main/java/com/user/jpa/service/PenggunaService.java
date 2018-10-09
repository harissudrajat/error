package com.user.jpa.service;

import com.user.jpa.domain.Pengguna;
import com.user.jpa.domain.PenggunaDetail;

public interface PenggunaService {

    Object createUser(Pengguna pengguna, PenggunaDetail penggunaDetail);

    Object findAll();
}

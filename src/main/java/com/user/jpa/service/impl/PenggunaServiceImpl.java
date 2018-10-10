package com.user.jpa.service.impl;

import com.user.jpa.dao.PenggunaDao;
import com.user.jpa.dao.PenggunaDetailDao;
import com.user.jpa.domain.Pengguna;
import com.user.jpa.domain.PenggunaDetail;
import com.user.jpa.service.PenggunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class PenggunaServiceImpl implements PenggunaService {

    @Autowired
    private PenggunaDao penggunaDao;

    @Autowired
    private PenggunaDetailDao penggunaDetailDao;

    @Override
    public Object createUser(PenggunaDetail penggunaDetail) {
        Pengguna pengguna = new Pengguna();
        penggunaDetail.getPengguna().setId(pengguna.getId());
        return penggunaDetailDao.save(penggunaDetail);

    }

    @Override
    public Object findAll() {
        return penggunaDetailDao.findAll();
    }
}

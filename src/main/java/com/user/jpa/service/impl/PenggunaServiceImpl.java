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
    public Object createUser(Pengguna pengguna, PenggunaDetail penggunaDetail) {

        Pengguna pUsername = penggunaDao.findByUsername(pengguna.getUsername());
        if (pUsername != null) {
            Map map = new HashMap();
            map.put("DATA", "02");
            map.put("MESSAGE", "GAGAL SAVE");
            return map;
        } else {
            Map m = new HashMap();
            penggunaDao.save(pengguna);
            Optional<Pengguna> pengguna_id = penggunaDao.findById(pengguna.getId());
            System.out.println(pengguna_id);
            penggunaDetailDao.save(penggunaDetail);
            m.put("DATA", "01");
            return m;
        }
    }

    @Override
    public Object findAll() {
        return penggunaDetailDao.findAll();
    }
}

package com.user.jpa;

import com.user.jpa.dao.PenggunaDao;
import com.user.jpa.dao.PenggunaDetailDao;
import com.user.jpa.domain.Pengguna;
import com.user.jpa.domain.PenggunaDetail;
import com.user.jpa.service.impl.PenggunaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    @Autowired
    PenggunaDao penggunaDao;

    @Autowired
    PenggunaDetailDao penggunaDetailDao;

    @Autowired
    PenggunaServiceImpl penggunaService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void createUser(){
        Pengguna p = new Pengguna();
//        p.setId(1);
        p.setUsername("admin");
        p.setPassword("admin");
        p.setActive(1);
//        penggunaDao.save(p);
//        System.out.println(penggunaDao.findById(1));

        PenggunaDetail pd = new PenggunaDetail();
        pd.setNama("Haris");
        pd.setAlamat("Jakarta");
        pd.setEmail("email");
        pd.setPengguna(p);
//        penggunaDetailDao.save(pd);
//        System.out.println(penggunaDetailDao.findAll());

        penggunaService.createUser(pd);
        System.out.println(penggunaDetailDao.findAll());
    }

}

package com.user.jpa.dao;

import com.user.jpa.domain.Pengguna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenggunaDao extends JpaRepository<Pengguna, Integer> {

    Pengguna findByUsername(String username);
}

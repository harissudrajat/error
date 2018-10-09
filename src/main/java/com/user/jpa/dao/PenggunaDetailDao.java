package com.user.jpa.dao;

import com.user.jpa.domain.PenggunaDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenggunaDetailDao extends JpaRepository<PenggunaDetail, Integer> {
}

package com.ykwithds.repository;

import com.ykwithds.entity.WDEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WDRepository extends JpaRepository<Integer, WDEntity> {
}

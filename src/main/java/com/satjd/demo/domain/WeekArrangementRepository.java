package com.satjd.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekArrangementRepository extends JpaRepository<WeekArrangement,Integer> {
}

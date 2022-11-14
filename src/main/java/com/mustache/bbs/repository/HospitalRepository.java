package com.mustache.bbs.repository;

import com.mustache.bbs.domain.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}

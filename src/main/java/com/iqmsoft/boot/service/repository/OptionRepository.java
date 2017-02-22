package com.iqmsoft.boot.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.boot.domain.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long>{

}

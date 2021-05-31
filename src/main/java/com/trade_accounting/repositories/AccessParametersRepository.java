package com.trade_accounting.repositories;

import com.trade_accounting.models.AccessParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessParametersRepository extends JpaRepository<AccessParameters, Long> {

}
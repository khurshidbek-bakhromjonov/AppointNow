package com.appointnow.dao;

import com.appointnow.entity.ExchangeRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRequestRepository extends JpaRepository<ExchangeRequest, Integer> {
}

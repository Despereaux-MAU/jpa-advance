package com.despereaux.jpaadvance.repository;

import com.despereaux.jpaadvance.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

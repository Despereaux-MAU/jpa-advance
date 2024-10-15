package com.despereaux.jpaadvance.repository;

import com.despereaux.jpaadvance.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}

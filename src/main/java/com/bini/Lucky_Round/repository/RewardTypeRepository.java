package com.bini.Lucky_Round.repository;


import com.bini.Lucky_Round.entity.RewardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardTypeRepository extends JpaRepository<RewardType, Long> {
}

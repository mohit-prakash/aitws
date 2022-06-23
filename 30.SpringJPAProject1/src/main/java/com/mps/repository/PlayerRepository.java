package com.mps.repository;

import org.springframework.data.repository.CrudRepository;

import com.mps.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {
}

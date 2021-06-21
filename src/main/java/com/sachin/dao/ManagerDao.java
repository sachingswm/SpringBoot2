package com.sachin.dao;

import com.sachin.entity.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerDao extends MongoRepository<Manager,Integer>{
}

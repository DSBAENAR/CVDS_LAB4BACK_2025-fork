package com.cvds.eci.bookingreservations.app_core.controller.app_core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cvds.eci.bookingreservations.app_core.controller.app_core.model.Laboratory;

public interface LaboratoryRepository extends MongoRepository<Laboratory,String>{
    
}

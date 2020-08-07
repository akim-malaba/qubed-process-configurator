/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kafka.api.repository;


import com.kafka.api.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mac
 */
@Repository
public interface EventsRepository extends JpaRepository<Events, Long> {

//  Events findByProcessid(Long processid);
//  List<Events> findByClientid(Long clientid);
    
    
}
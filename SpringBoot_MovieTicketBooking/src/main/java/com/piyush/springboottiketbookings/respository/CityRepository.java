package com.piyush.springboottiketbookings.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piyush.springboottiketbookings.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}

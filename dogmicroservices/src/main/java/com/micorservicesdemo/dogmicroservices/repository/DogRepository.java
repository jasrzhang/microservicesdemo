package com.micorservicesdemo.dogmicroservices.repository;

import com.micorservicesdemo.dogmicroservices.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}

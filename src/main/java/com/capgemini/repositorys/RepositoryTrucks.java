package com.capgemini.repositorys;



import com.capgemini.model.Truck;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryTrucks extends CrudRepository<Truck, Long> { // type truck op unieke Key Id (long).

    List<Truck> findByBrand(String brand);
}

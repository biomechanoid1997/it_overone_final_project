package com.example.it_overone_final_project.repos;

import com.example.it_overone_final_project.models.AdvertModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepository extends CrudRepository<AdvertModel, Long> {

}

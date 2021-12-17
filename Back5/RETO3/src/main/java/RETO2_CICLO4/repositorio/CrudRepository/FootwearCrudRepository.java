/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RETO2_CICLO4.repositorio.CrudRepository;

import RETO2_CICLO4.modelo.Footwear;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 *
 * @author Sofia
 */
public interface FootwearCrudRepository extends MongoRepository<Footwear, String>{
    //*Reto 5 metodos
    @Query("{'price': {$lte:?0}}")
    List<Footwear> findByPrice(double price);

    @Query("{'description': {$regex:?0,$options:'i'}}")
    List<Footwear> findByDescription(String description);

    @Query("{'category': {$regex:?0,$options:'i'}}")
    List<Footwear> findByCategory(String category);


}

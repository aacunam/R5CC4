/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RETO2_CICLO4.repositorio;

import RETO2_CICLO4.repositorio.CrudRepository.FootwearCrudRepository;
import RETO2_CICLO4.modelo.Footwear;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sofia
 */
@Repository
public class FootwearRepository {
    @Autowired
    private FootwearCrudRepository footwearCrudRepository;
    
public List<Footwear> getAll() {
        return footwearCrudRepository.findAll();
    }

    public Optional<Footwear> getFootwears(String reference) {
        return footwearCrudRepository.findById(reference);
    }
    public Footwear create(Footwear Footwear) {
        return footwearCrudRepository.save(Footwear);
    }

    public void update(Footwear Footwear) {
        footwearCrudRepository.save(Footwear);
    }
    
    public void delete(Footwear Footwear) {
        footwearCrudRepository.delete(Footwear);
    }

    //Reto 5 metodos
    public List<Footwear> getProductbyPrice(double price){

    return footwearCrudRepository.findByPrice(price);
    }
    public List<Footwear> getProductByDescription(String description){
        return  footwearCrudRepository.findByDescription(description);
    }

    public List<Footwear> getByCategory(String category){
        return  footwearCrudRepository.findByCategory(category);
    }
}
    
    
    


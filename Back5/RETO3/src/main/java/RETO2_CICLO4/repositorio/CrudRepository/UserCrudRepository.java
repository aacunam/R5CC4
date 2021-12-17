/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RETO2_CICLO4.repositorio.CrudRepository;

import RETO2_CICLO4.modelo.User;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Sofia
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    Optional<User> findTopByOrderByIdDesc();

    //* Reto 5 metodos
    @Query("{monthBirthtDay: ?0}")
    List<User> findByMonthBirthtDay(String monthBirthtDay);
    List<User> findByType(String type);
}

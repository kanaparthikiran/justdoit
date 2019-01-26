/**
 * 
 */
package com.hotel.api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hotel.api.entities.HotelEntity;

/**
 * @author kkanaparthi
 *
 */
public interface IHotelRepository extends CrudRepository<HotelEntity, String> {

    List<HotelEntity> findByHotelName(String name);

}

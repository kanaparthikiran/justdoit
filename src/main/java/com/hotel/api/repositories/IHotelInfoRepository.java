/**
 * 
 */
package com.hotel.api.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.api.entities.HotelDetail;

/**
 * @author kkanaparthi
 *
 */
public interface IHotelInfoRepository extends MongoRepository<HotelDetail, String> {

    List<HotelDetail> findByName(String name);
    List<HotelDetail> findByLocation(String location);


}
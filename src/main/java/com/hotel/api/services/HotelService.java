/**
 * 
 */
package com.hotel.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.api.beans.HotelSearchData;
import com.hotel.api.entities.HotelEntity;
import com.hotel.api.repositories.IHotelRepository;
import com.hotel.api.util.RequestToEntityTransformer;

/**
 * @author kkanaparthi
 *
 */
@Service
public class HotelService implements IHotelService {

	
	@Autowired
    private IHotelRepository hotelRepository;

	
	@Override
	public List<HotelEntity> addHotel(HotelSearchData hotel) {
		
		 hotelRepository.save(RequestToEntityTransformer.transformRequest(hotel));
		 return StreamSupport.stream(hotelRepository.findAll().spliterator(), false)
                 .collect(Collectors.toList());
	}

	@Override
	public List<HotelEntity> updateHotel(HotelSearchData hotel) {
		Optional<HotelEntity> currentHotel = hotelRepository.findById(hotel.getId());
		if(currentHotel.isPresent()) {
			hotelRepository.save(RequestToEntityTransformer.transformRequest(hotel));
		}
		 return StreamSupport.stream(hotelRepository.findAll().spliterator(), false)
                 .collect(Collectors.toList());
	}

	
	@Override
	public List<HotelEntity> deleteHotel(String id) {
		hotelRepository.deleteById(id);
		 return StreamSupport.stream(hotelRepository.findAll().spliterator(), false)
                 .collect(Collectors.toList());
	}

	@Override
	public List<HotelEntity> findHotelById(String id) {
		Optional<HotelEntity> currentHotel = hotelRepository.findById(id);
		List<HotelEntity> hotelList = new ArrayList<>();
		if(currentHotel.isPresent()) {
			hotelList.add(currentHotel.get());
		}
		return hotelList; 
	}

	@Override
	public List<HotelEntity> findHotelByName(String name) {
		return hotelRepository.findByHotelName(name);
	}

	@Override
	public List<HotelEntity> listAllHotels() {
		 return StreamSupport.stream(hotelRepository.findAll().spliterator(), false)
                 .collect(Collectors.toList());
	}

}

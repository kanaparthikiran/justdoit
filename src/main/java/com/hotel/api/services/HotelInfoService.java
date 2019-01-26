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
import com.hotel.api.entities.HotelDetail;
import com.hotel.api.repositories.IHotelInfoRepository;
import com.hotel.api.util.RequestToEntityTransformer;

/**
 * @author kkanaparthi
 *
 */
@Service
public class HotelInfoService implements IHotelInfoService {

	
	@Autowired
    private IHotelInfoRepository hotelRepository;

	
	@Override
	public List<HotelDetail> addHotel(HotelSearchData hotel) {
		
		 hotelRepository.save(RequestToEntityTransformer.transformRequestInfo(hotel));
		 return StreamSupport.stream(hotelRepository.findAll().spliterator(), false)
                 .collect(Collectors.toList());
	}

	@Override
	public List<HotelDetail> updateHotel(HotelSearchData hotel) {
		Optional<HotelDetail> currentHotel = hotelRepository.findById(hotel.getId());
		if(currentHotel.isPresent()) {
			hotelRepository.save(RequestToEntityTransformer.transformRequestInfo(hotel));
		}
		 return StreamSupport.stream(hotelRepository.findAll().spliterator(), false)
                 .collect(Collectors.toList());
	}

	
	@Override
	public List<HotelDetail> deleteHotel(String id) {
		hotelRepository.deleteById(id);
		 return StreamSupport.stream(hotelRepository.findAll().spliterator(), false)
                 .collect(Collectors.toList());
	}

	@Override
	public List<HotelDetail> findHotelById(String id) {
		Optional<HotelDetail> currentHotel = hotelRepository.findById(id);
		List<HotelDetail> hotelList = new ArrayList<>();
		if(currentHotel.isPresent()) {
			hotelList.add(currentHotel.get());
		}
		return hotelList; 
	}

	@Override
	public List<HotelDetail> findHotelByName(String name) {
		return hotelRepository.findByName(name);
	}

	@Override
	public List<HotelDetail> listAllHotels() {
		 return StreamSupport.stream(hotelRepository.findAll().spliterator(), false)
                 .collect(Collectors.toList());
	}

}

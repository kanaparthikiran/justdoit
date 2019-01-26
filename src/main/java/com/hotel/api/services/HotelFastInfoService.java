///**
// * 
// */
//package com.hotel.api.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.StreamSupport;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.hotel.api.beans.HotelSearchData;
//import com.hotel.api.entities.HotelFastDetail;
//import com.hotel.api.repositories.IHotelFastRepository;
//import com.hotel.api.util.RequestToEntityTransformer;
//
///**
// * @author kkanaparthi
// *
// */
//@Service
//public class HotelFastInfoService implements IHotelFastInfoService {
//
//	
//	@Autowired
//    private IHotelFastRepository hotelFastRepository;
//	
//	
//	@Override
//	public List<HotelFastDetail> addHotel(HotelSearchData hotel) {
//		hotelFastRepository.save(RequestToEntityTransformer.transformFastRequestInfo(hotel));
//		 return StreamSupport.stream(hotelFastRepository.findAll().spliterator(), false)
//                .collect(Collectors.toList());
//	}
//
//	@Override
//	public List<HotelFastDetail> updateHotel(HotelSearchData hotel) {
//		Optional<HotelFastDetail> currentHotel = hotelFastRepository.findById(hotel.getId());
//		if(currentHotel.isPresent()) {
//			hotelFastRepository.save(RequestToEntityTransformer.transformFastRequestInfo(hotel));
//		}
//		 return StreamSupport.stream(hotelFastRepository.findAll().spliterator(), false)
//                 .collect(Collectors.toList());
//	}
//
//	@Override
//	public List<HotelFastDetail> deleteHotel(String id) {
//		hotelFastRepository.deleteById(id);
//		 return StreamSupport.stream(hotelFastRepository.findAll().spliterator(), false)
//                .collect(Collectors.toList());
//	}
//
//	@Override
//	public List<HotelFastDetail> findHotelById(String id) {
//		Optional<HotelFastDetail> currentHotel = hotelFastRepository.findById(id);
//		List<HotelFastDetail> hotelList = new ArrayList<>();
//		if(currentHotel.isPresent()) {
//			hotelList.add(currentHotel.get());
//		}
//		return hotelList;
//	}
//
//	@Override
//	public List<HotelFastDetail> findHotelByName(String name) {
//		return null;
//	}
//
//	@Override
//	public List<HotelFastDetail> listAllHotels() {
//		 return StreamSupport.stream(hotelFastRepository.findAll().spliterator(), false)
//                 .collect(Collectors.toList());
//	}
//
//	
//
//}

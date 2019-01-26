/**
 * 
 */
package com.hotel.api.services;

import java.util.List;

import com.hotel.api.beans.HotelSearchData;
import com.hotel.api.entities.HotelEntity;

/**
 * @author kkanaparthi
 *
 */
public interface IHotelService {
	
	public List<HotelEntity> addHotel(HotelSearchData hotel);
	public List<HotelEntity> updateHotel(HotelSearchData hotel);
	public List<HotelEntity> deleteHotel(String id);
	public List<HotelEntity> findHotelById(String id);
	public List<HotelEntity> findHotelByName(String name);
	public List<HotelEntity> listAllHotels();


}

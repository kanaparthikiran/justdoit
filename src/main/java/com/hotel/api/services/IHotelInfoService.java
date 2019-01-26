/**
 * 
 */
package com.hotel.api.services;

import java.util.List;

import com.hotel.api.beans.HotelSearchData;
import com.hotel.api.entities.HotelDetail;

/**
 * @author kkanaparthi
 *
 */
public interface IHotelInfoService {
	
	public List<HotelDetail> addHotel(HotelSearchData hotel);
	public List<HotelDetail> updateHotel(HotelSearchData hotel);
	public List<HotelDetail> deleteHotel(String id);
	public List<HotelDetail> findHotelById(String id);
	public List<HotelDetail> findHotelByName(String name);
	public List<HotelDetail> listAllHotels();


}

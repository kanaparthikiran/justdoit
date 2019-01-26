/**
 * 
 */
package com.hotel.api.util;

import com.hotel.api.beans.HotelSearchData;
import com.hotel.api.entities.HotelDetail;
import com.hotel.api.entities.HotelEntity;

/**
 * @author kkanaparthi
 *
 */
public class RequestToEntityTransformer {

	//Utility class not to instantiate
	  private RequestToEntityTransformer() {
		    throw new IllegalStateException("Utility class");
	  }
	  
	/**  
	 * Transforms the HotelSearchRequest to HotelEntity
	 * 
	 * @param searchRequest
	 * @return
	 */
	public static HotelEntity transformRequest(HotelSearchData searchRequest) {
		HotelEntity hotelEntity =  null;
		if(searchRequest!=null) {
			hotelEntity = new HotelEntity();
			hotelEntity.setId(searchRequest.getId());
			hotelEntity.setHotelName(searchRequest.getHotelName());
			hotelEntity.setHotelRating(searchRequest.getHotelRating());
			hotelEntity.setLocation(searchRequest.getLocation());
			hotelEntity.setBookingDate(searchRequest.getBookingDate());
			hotelEntity.setOfferPercentage(searchRequest.getOfferPercentage());
			hotelEntity.setPricePerNight(searchRequest.getPricePerNight());
		}
		return hotelEntity;
	}
	
	/**  
	 * Transforms the HotelSearchRequest to HotelEntity
	 * 
	 * @param searchRequest
	 * @return
	 */
	public static HotelDetail transformRequestInfo(HotelSearchData searchRequest) {
		HotelDetail hotelEntity =  null;
		if(searchRequest!=null) {
			hotelEntity = new HotelDetail();
			hotelEntity.setId(searchRequest.getId());
			hotelEntity.setName(searchRequest.getHotelName());
			hotelEntity.setLocation(searchRequest.getLocation());
			hotelEntity.setHotelRating(searchRequest.getHotelRating());
			hotelEntity.setBookingDate(searchRequest.getBookingDate());
			hotelEntity.setOfferPercentage(searchRequest.getOfferPercentage());
			hotelEntity.setPricePerNight(searchRequest.getPricePerNight());
		}
		return hotelEntity;
	}
	
//	/**  
//	 * Transforms the HotelSearchRequest to HotelEntity
//	 * 
//	 * @param searchRequest
//	 * @return
//	 */
//	public static HotelFastDetail transformFastRequestInfo(HotelSearchData searchRequest) {
//		HotelFastDetail hotelEntity =  null;
//		if(searchRequest!=null) {
//			hotelEntity = new HotelFastDetail();
//			hotelEntity.setId(searchRequest.getId());
//			hotelEntity.setName(searchRequest.getHotelName());
//			hotelEntity.setLocation(searchRequest.getLocation());
//			hotelEntity.setHotelRating(searchRequest.getHotelRating());
//			hotelEntity.setBookingDate(searchRequest.getBookingDate());
//			hotelEntity.setOfferPercentage(searchRequest.getOfferPercentage());
//			hotelEntity.setPricePerNight(searchRequest.getPricePerNight());
//		}
//		return hotelEntity;
//	}
}

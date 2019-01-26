/**
 * 
 */
package com.hotel.api.beans;

import java.io.Serializable;
import java.util.List;

import com.hotel.api.entities.HotelDetail;
import com.hotel.api.entities.HotelEntity;

/**
 * @author kkanaparthi
 *
 */
public class HotelResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6992465281248649990L;
	
    private List<HotelEntity> hotelSearchResults;
    private String status;
    private int statusCode;
	private List<HotelDetail> hotelInfoResults;
	
	//private List<HotelFastDetail>  hotelFastInfoResults;


    public List<HotelDetail> getHotelInfoResults() {
        return hotelInfoResults;
    }

    public void setHotelInfoResults(List<HotelDetail> hotelSearchResults) {
        this.hotelInfoResults = hotelSearchResults;
    }

    public List<HotelEntity> getHotelSearchResults() {
        return hotelSearchResults;
    }

    public void setHotelSearchResults(List<HotelEntity> hotelSearchResults) {
        this.hotelSearchResults = hotelSearchResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

//	public List<HotelFastDetail> getHotelFastInfoResults() {
//		return hotelFastInfoResults;
//	}
//
//	public void setHotelFastInfoResults(List<HotelFastDetail> hotelFastInfoResults) {
//		this.hotelFastInfoResults = hotelFastInfoResults;
//	}




}

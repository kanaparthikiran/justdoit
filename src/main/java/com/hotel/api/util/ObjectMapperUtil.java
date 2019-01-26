/**
 * 
 */
package com.hotel.api.util;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author kkanaparthi
 * 
 * Used with Object Mapper to handle special cases required for 
 * date formatting, and time zone masking.
 *
 */
public class ObjectMapperUtil {

	
	//Utility class not to instantiate
	  private ObjectMapperUtil() {
		    throw new IllegalStateException("Utility class");
	  }
	
	/**
	 * Updates ObjectMapper to handle date formatting, and to ignore timezone 
	 * for display purposes.
	 * 
	 * @param objectMapper accepts the ObjectMapper
	 * @return returns the updated ObjectMapper with the special handling
	 */
	public static ObjectMapper updateObjectMapper(ObjectMapper objectMapper) {
		SimpleDateFormat sdf = new SimpleDateFormat(HotelServiceConstants.HOTEL_DATE_FORMAT);
        objectMapper.setDateFormat(sdf);
        objectMapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
        return objectMapper;
	}
}

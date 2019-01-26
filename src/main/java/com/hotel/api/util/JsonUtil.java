/**
 * 
 */
package com.hotel.api.util;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotel.api.beans.HotelResponse;
import com.hotel.api.beans.HotelSearchResponse;

/**
 * @author kkanaparthi
 *
 */
public class JsonUtil {
	
	
	//Utility class not to instantiate
	  private JsonUtil() {
		    throw new IllegalStateException("Utility class");
	  }
	  
	/**
     * The Logger object to log details.
     */
	private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);
    
    /**
     * 
     * Gets the Error Response for any exceptions happened during the Hotel Search 
     * @param objectMapper
     * @param response
     * @return
     * @throws JsonProcessingException
     */
	public static Optional<String> getErrorResponse(ObjectMapper objectMapper, HotelSearchResponse response) {
		String jsonResponse = null;
		try {
			response.setHotelSearchResults(null);
			response.setStatus(HotelServiceStatus.ERROR.toString());
			response.setStatusCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			jsonResponse = objectMapper.writeValueAsString(response);
			
		} catch(Exception ex) {
			logger.error("Exception occurred inside getErrorResponse %s ", ex);
		}
		return Optional.ofNullable(jsonResponse);
	}
	
    /**
     * 
     * Gets the Error Response for any exceptions happened during the Hotel Search 
     * @param objectMapper
     * @param response
     * @return
     * @throws JsonProcessingException
     */
	public static String getStrErrorResponse(ObjectMapper objectMapper, HotelResponse response) {
		String jsonResponse = null;
		try {
			response.setHotelSearchResults(null);
			response.setStatus(HotelServiceStatus.ERROR.toString());
			response.setStatusCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			jsonResponse = objectMapper.writeValueAsString(response);
			
		} catch(Exception ex) {
			logger.error("Exception occurred inside getErrorResponse %s ", ex);
		}
		return jsonResponse;
	}


}

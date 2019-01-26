///**
// * 
// */
//package com.hotel.api.controllers;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import javax.servlet.http.HttpServletResponse;
//import javax.validation.Valid;
//import javax.validation.constraints.NotNull;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.hotel.api.beans.HotelInfoResponse;
//import com.hotel.api.beans.HotelSearchData;
//import com.hotel.api.beans.HotelSearchResponse;
//import com.hotel.api.entities.HotelFastDetail;
//import com.hotel.api.services.IHotelFastInfoService;
//import com.hotel.api.util.HotelServiceStatus;
//import com.hotel.api.util.JsonUtil;
//import com.hotel.api.util.ObjectMapperUtil;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//
///**
// * @author kkanaparthi
// *
// */
//@RestController
//@RequestMapping(path="/hotel/fast")
//@Api(value="hotelDetails", description="Operations pertaining to Faster Hotel Details")
//public class HotelFastInfoController {
//	
//
//	@Autowired
//	private IHotelFastInfoService hotelFastInfoService;
//
//
//	/**
//     * The Logger object to log details.
//     */
//    private static final Logger LOGGER = LoggerFactory.getLogger(HotelFastInfoController.class);
//
//    
//    private ObjectMapper objectMapper = new ObjectMapper().
//    		setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
//    
//    
//
//    
//    /**
//     * Looks for hotels by name. 
//     *
//     * @param name query parameter
//     * @return list of hotels whose first or last name contains the passed
//     * parameter as a substring or list of all hotels stored in the database.
//     */
//    @ApiOperation(value = "View a list of all Available hotels",response = ResponseEntity.class)
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Successfully retrieved list"),
//            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
//            @ApiResponse(code=500,message="Internal Server Error")
//
//    })
//     @GetMapping(path = "/all",
//    	    produces=MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> findAllHotels() {
//        LOGGER.info("Start HotelSearchRequest findAllHotels ");
//        String jsonResponse =null;
//        HotelSearchResponse response = new HotelSearchResponse();
//        objectMapper =  ObjectMapperUtil.updateObjectMapper(objectMapper);
//        try {
//	        if (objectMapper!=null) {
//	            List<HotelFastDetail> listOfElements = hotelFastInfoService.listAllHotels();
//	            response.setStatus(HotelServiceStatus.SUCCESS.toString());
//	            response.setStatusCode(HttpServletResponse.SC_OK);
//	            response.setHotelFastInfoResults(listOfElements);
//	            jsonResponse = objectMapper.writeValueAsString(response);
//	            LOGGER.info("Data found for HotelSearchRequest findAllHotels ");
//	        } else {
//	            LOGGER.info("Data not found for HotelSearchRequest findAllHotels ");
//	            response.setHotelSearchResults(new ArrayList<>());
//	        }
//        } catch (Exception e) {
//            jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//
//            LOGGER.error("Exception occurred inside findAllHotels  with error = %s ", e);
//        }
//        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
//    }
//
//        
//    /**
//     * Retrieves representation of an instance of hotel.findById
//     *
//     * @param id the id of an hotel.
//     * @return Optional containing the found hotel or an empty Optional
//     * 
//     */
//    @ApiOperation(value = "Find Available Hotel By Id",response = ResponseEntity.class)
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Successfully retrieved list"),
//            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
//            @ApiResponse(code=500,message="Internal Server Error")
//    })
//    @GetMapping(value="/{id}",
//    produces=MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> findById(@NotNull @Valid final @PathVariable("id") String id) {
//      String jsonResponse =null;
//      HotelSearchResponse response = new HotelSearchResponse();
//      objectMapper =  ObjectMapperUtil.updateObjectMapper(objectMapper);
//
//    	try {
//    		if(objectMapper!=null) {
//	            response.setStatus(HotelServiceStatus.SUCCESS.toString());
//	            response.setStatusCode(HttpServletResponse.SC_OK);
//	            jsonResponse = objectMapper.writeValueAsString(hotelFastInfoService.findHotelById(id));
//    		} else {
//    			jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//    		}
//    	} catch(Exception ex) {
//          jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//          LOGGER.error("Exception occurred inside searchHotels  method with error = %s ", ex);
//    	}
//        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
//
//    }
//    
//    
//    /**
//     * adds an instance of hotel
//     *
//     * @param id the id of an hotel.
//     * @return Optional containing the found hotel or an empty Optional
//     * 
//     */
//    @ApiOperation(value = "Add a Hotel to Database",response = ResponseEntity.class)
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Added Hotel to the List"),
//            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
//            @ApiResponse(code=500,message="Internal Server Error")
//    })
//    @PostMapping(value="/hotel",
//    produces=MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> addHotel(@Valid @RequestBody HotelSearchData hotel) {
//      String jsonResponse =null;
//      HotelInfoResponse response = new HotelInfoResponse();
//      objectMapper =  ObjectMapperUtil.updateObjectMapper(objectMapper);
//
//    	try {
//    		if(objectMapper!=null) {
//	            response.setStatus(HotelServiceStatus.SUCCESS.toString());
//	            response.setStatusCode(HttpServletResponse.SC_OK);
//	            response.setHotelFastInfoResults(hotelFastInfoService.addHotel(hotel));
//	            jsonResponse = objectMapper.writeValueAsString(response);
//    		} else {
//    			jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//    		}
//    	} catch(Exception ex) {
//          jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//          LOGGER.error("Exception occurred inside addHotel  "
//          		+ " with error = %s ", ex);
//    	}
//        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
//
//    }
//
//    
//    
//    /**
//     * Updates hotel with the given details
//     *
//     * @param id the id of an hotel.
//     * @return Response containing the list of All Hotels including this one
//     * 
//     */
//    @ApiOperation(value = "Update a Hotel to Database",response = ResponseEntity.class)
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Updated Hotel to the List"),
//            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
//            @ApiResponse(code=500,message="Internal Server Error")
//    })
//    @PutMapping(value="/hotel",
//    produces=MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> updateHotel(@Valid @RequestBody HotelSearchData hotel) {
//      String jsonResponse =null;
//      HotelInfoResponse response = new HotelInfoResponse();
//      objectMapper =  ObjectMapperUtil.updateObjectMapper(objectMapper);
//
//    	try {
//    		if(objectMapper!=null) {
//	            response.setStatus(HotelServiceStatus.SUCCESS.toString());
//	            response.setStatusCode(HttpServletResponse.SC_OK);
//	            response.setHotelFastInfoResults(hotelFastInfoService.updateHotel(hotel));
//	            jsonResponse = objectMapper.writeValueAsString(response);
//    		} else {
//    			jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//    		}
//    	} catch(Exception ex) {
//          jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//          LOGGER.error("Exception occurred inside updateHotel"
//          		+ "   with error = %s ", ex);
//    	}
//        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
//
//    }
//    
//    
//    /**
//     * Retrieves representation of an instance of hotel.findById
//     *
//     * @param id the id of an hotel.
//     * @return Optional containing the found hotel or an empty Optional
//     * 
//     */
//    @ApiOperation(value = "Delete a Hotel from Database",response = ResponseEntity.class)
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Deleted Hotel from the list"),
//            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
//            @ApiResponse(code=500,message="Internal Server Error")
//    })
//    @DeleteMapping(value="/{id}",
//    produces=MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> deleteHotel(@NotNull @Valid final @PathVariable("id") String id) {
//      String jsonResponse =null;
//      HotelInfoResponse response = new HotelInfoResponse();
//      objectMapper =  ObjectMapperUtil.updateObjectMapper(objectMapper);
//      try {
//    		if(objectMapper!=null) {
//	            response.setStatus(HotelServiceStatus.SUCCESS.toString());
//	            response.setStatusCode(HttpServletResponse.SC_OK);
//	            response.setHotelFastInfoResults(hotelFastInfoService.deleteHotel(id));
//	            jsonResponse = objectMapper.writeValueAsString(response);
//    		} else {
//    			jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//    		}
//    	} catch(Exception ex) {
//          jsonResponse = JsonUtil.getStrErrorResponse(objectMapper, response);
//          LOGGER.error("Exception occurred inside deleteHotel"
//          		+ "  method with error = %s ", ex);
//    	}
//      return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
//
//    }
//
//
//}
package com.hotel.api.repositories;
///**
// * 
// */
//package com.hotel.api.repositories;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.hotel.api.beans.HotelSearchData;
//import com.hotel.api.entities.HotelFastDetail;
//
///**
// * @author kkanaparthi
// *
// */
//@Repository
//public class HotelFastRepository implements IHotelFastRepository {
//
//	private static final String KEY = "hotel";
//	
//    private RedisTemplate<String, Object> redisTemplate;
//    
//    private HashOperations hashOperations;
//    
//    @Autowired
//    public HotelFastRepository(RedisTemplate<String, Object> redisTemplate){
//        this.redisTemplate = redisTemplate;
//    }
//    
//    @PostConstruct
//    private void init(){
//        hashOperations = redisTemplate.opsForHash();
//    }
//    public List<HotelFastDetail> add(final HotelSearchData hotelDetail) {
//        hashOperations.put(KEY, hotelDetail.getId(), hotelDetail.getHotelName());
//		return findAllHotels();
//    }
//    
//    public void delete(final String id) {
//        hashOperations.delete(KEY, id);
//    }
//    
//    public HotelFastDetail findHotel(final String id){
//        return (HotelFastDetail) hashOperations.get(KEY, id);
//    }
//    
//    public List<HotelFastDetail> findAllHotels(){
//        Map<Object,Object> allValues = (Map<Object, Object>) hashOperations.entries(KEY);
//        List<Object>  listObj =  allValues.values().stream()
//        .collect(Collectors.toList());
//        List<HotelFastDetail> responseList = new ArrayList<>();
//		if(listObj!=null && !listObj.isEmpty()) {
//			for(Object responseObj : listObj) {
//				try {
//					responseList.add(new ObjectMapper().readValue((String)responseObj,HotelFastDetail.class));
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return responseList;
//    }
//
//	
//}

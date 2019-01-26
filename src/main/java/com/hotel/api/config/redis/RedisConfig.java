/**
 * 
 */
package com.hotel.api.config.redis;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.AbstractRedisConnection;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisPipelineException;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.Subscription;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

/**
 * @author kkanaparthi
 *
 */
@Configuration
class RedisConfig extends AbstractRedisConnection {


  
  @Bean
  public LettuceConnectionFactory redisConnectionFactory() {
    return new LettuceConnectionFactory(new RedisStandaloneConfiguration("devinsidercache.aws.hotwire.com", 6379));
  }
  
  @Bean
  public RedisTemplate<String, Object> redisTemplate() {
      final RedisTemplate<String, Object> template = new RedisTemplate<>();
      template.setConnectionFactory(redisConnectionFactory());
      template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
      return template;
  }
  
  
@Override
public boolean isClosed() {
	
	return false;
}

@Override
public Object getNativeConnection() {
	
	return null;
}

@Override
public boolean isQueueing() {
	
	return false;
}

@Override
public boolean isPipelined() {
	
	return false;
}

@Override
public void openPipeline() {
	
	
}

@Override
public List<Object> closePipeline() throws RedisPipelineException {
	
	return null;
}

@Override
public Object execute(String command, byte[]... args) {
	
	return null;
}

@Override
public void multi() {
	
	
}

@Override
public List<Object> exec() {
	
	return null;
}

@Override
public void discard() {
	
}

@Override
public void watch(byte[]... keys) {
	
	
}

@Override
public void unwatch() {
	
	
}

@Override
public boolean isSubscribed() {
	
	return false;
}

@Override
public Subscription getSubscription() {
	
	return null;
}

@Override
public Long publish(byte[] channel, byte[] message) {
	
	return null;
}

@Override
public void subscribe(MessageListener listener, byte[]... channels) {
	
	
}

@Override
public void pSubscribe(MessageListener listener, byte[]... patterns) {
	
	
}

@Override
public void select(int dbIndex) {
	
	
}

@Override
public byte[] echo(byte[] message) {
	
	return null;
}

@Override
public String ping() {
	
	return null;
}
}

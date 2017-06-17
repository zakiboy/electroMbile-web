package com.electrombile.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtil {
	
	private static JedisPool jedisPool = null;
	
		/**
	      * 获取Jedis实例
	      * @return
	      */
	     public synchronized static Jedis getJedis() {
	         try {
	             if (jedisPool != null) {
	                 Jedis resource = jedisPool.getResource();
	                 return resource;
	             } else {
	                 return null;
	             }
	         } catch (Exception e) {
	             e.printStackTrace();
	             return null;
	         }
	     }
	     
	     /**
	      * 释放jedis资源
	      * @param jedis
	      */
	     @SuppressWarnings("deprecation")
		public static void returnResource(final Jedis jedis) {
	         if (jedis != null) {
	             jedisPool.returnResource(jedis);
	         }
	     }
}

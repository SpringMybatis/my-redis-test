package com.ibs.redis.demo.test;

import redis.clients.jedis.Jedis;

public class RedisMainTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		String keys = "name";
		// 删数据
		jedis.del(keys);
		// 存数据
		jedis.set(keys, "snowolf");
		// 取数据
		String value = jedis.get(keys);
		System.out.println(value);
	}

}

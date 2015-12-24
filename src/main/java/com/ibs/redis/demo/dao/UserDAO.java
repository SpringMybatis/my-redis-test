package com.ibs.redis.demo.dao;

import java.util.List;

import com.ibs.redis.demo.model.User;

public interface UserDAO {

	/**
	 * 新增 <br>
	 * ------------------------------<br>
	 * 
	 * @param user
	 * @return
	 */
	public boolean add(User user);

	/**
	 * 批量新增 使用pipeline方式 <br>
	 * ------------------------------<br>
	 * 
	 * @param list
	 * @return
	 */
	public boolean add(List<User> list);

	/**
	 * 删除 <br>
	 * ------------------------------<br>
	 * 
	 * @param key
	 */
	public void delete(String key);

	/**
	 * 删除多个 <br>
	 * ------------------------------<br>
	 * 
	 * @param keys
	 */
	public void delete(List<String> keys);

	/**
	 * 修改 <br>
	 * ------------------------------<br>
	 * 
	 * @param user
	 * @return
	 */
	public boolean update(User user);

	/**
	 * 通过key获取 <br>
	 * ------------------------------<br>
	 * 
	 * @param keyId
	 * @return
	 */
	public User get(String keyId);

}

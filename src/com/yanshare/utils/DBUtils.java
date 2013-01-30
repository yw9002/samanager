/**
 * 
 */
package com.yanshare.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

/**
 * @author LiJingyuan
 * @date 2012-8-20
 */
public class DBUtils {
	public static Log log = LogFactory.getLog(DBUtils.class);
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private boolean displaySql;
	private long startTime;
	private long endTime;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public <T> int addGetKey(String sql,T obj){
		int key = 0;
		try {
			KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
			namedParameterJdbcTemplate.update(sql, new BeanPropertySqlParameterSource(obj), generatedKeyHolder);
			key = generatedKeyHolder.getKey().intValue();
		} catch (InvalidDataAccessApiUsageException e) {
			printError(e);
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, "");
		}
		return key;
	}
	
	public <T> int addOrUpdate(String sql,T obj){
		int rowsnum = 0;
		try {
			startTime = System.currentTimeMillis();
			rowsnum = namedParameterJdbcTemplate.update(sql, new BeanPropertySqlParameterSource(obj));
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, "");
		}
		return rowsnum;
	}
	
	public int update(String sql,Map<String, Object> map){
		int rowsnum = 0;
		try {
			startTime = System.currentTimeMillis();
			rowsnum = namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource().addValues(map));
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, "");
		}
		return rowsnum;
	}
	
	public <T> int[] batchUpdate(String sql, List<T> batchArgs){
		int[] rowsnum = new int[batchArgs.size()];
		try {
			startTime = System.currentTimeMillis();
			SqlParameterSource[] parameterSources = new BeanPropertySqlParameterSource[batchArgs.size()]; 
			for (int i=0;i<batchArgs.size();i++) {
				T t = batchArgs.get(i);
				SqlParameterSource _parameterSource= new BeanPropertySqlParameterSource(t);
				parameterSources[i]=_parameterSource;
			}
			rowsnum = namedParameterJdbcTemplate.batchUpdate(sql, parameterSources);
			endTime = System.currentTimeMillis();
		} catch (Exception e) {
			printError(e);
		} finally {
			printSql(sql, "");
		}
		return rowsnum;
	}
	
	public <T> T getObject(String sql, Class<T> clazz, Map<String,Object> paramMap) {//Map<String,Object> paramMap
		T obj = null;
		try {
			startTime = System.currentTimeMillis();
			obj = namedParameterJdbcTemplate.queryForObject(sql, paramMap, ParameterizedBeanPropertyRowMapper.newInstance(clazz));
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, paramMap.toString());
		}
		return obj;
	}
	
	public <T> T getObject(String sql,Class<T> clazz,Object object) {
		T obj = null;
		try {
			startTime = System.currentTimeMillis();
			SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(object);
			obj = namedParameterJdbcTemplate.queryForObject(sql, parameterSource, ParameterizedBeanPropertyRowMapper.newInstance(clazz));
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, "");
		}
		return obj;
	}
	
	public Map<String, Object> getMap(String sql,Map<String, Object> paramMap){
		Map<String, Object> map = null;
		try {
			startTime = System.currentTimeMillis();
			map = namedParameterJdbcTemplate.queryForMap(sql, paramMap);
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, paramMap.toString());
		}
		return map;
	}
	
	public Map<String, Object> getMap(String sql,Object object){
		Map<String, Object> map = null;
		try {
			startTime = System.currentTimeMillis();
			map = namedParameterJdbcTemplate.queryForMap(sql, new BeanPropertySqlParameterSource(object));
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, "");
		}
		return map;
	}
	
	public int getCount(String sql,Map<String, Object> paramMap) {
		int count = 0;
		try {
			startTime = System.currentTimeMillis();
			count = namedParameterJdbcTemplate.queryForInt(sql, paramMap);
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, paramMap.toString());
		}
		return count;
	}
	 
	public <T> List<T> getArrayList(String sql, Class<T> clazz, Map<String,Object> paramMap) {
		List<T> queryForList = null;
		try {
			startTime = System.currentTimeMillis();
			queryForList = namedParameterJdbcTemplate.query(sql, paramMap, ParameterizedBeanPropertyRowMapper.newInstance(clazz));
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, paramMap.toString());
		}
		return queryForList;
	}
	
	public <T> List<T> getArrayList(String sql, Class<T> clazz, Object obj) {
		List<T> queryForList = null;
		try {
			startTime = System.currentTimeMillis();
			queryForList = namedParameterJdbcTemplate.query(sql, new BeanPropertySqlParameterSource(obj), ParameterizedBeanPropertyRowMapper.newInstance(clazz));
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, "");
		}
		return queryForList;
	}
	
	public List<Map<String, Object>> getArrayList(String sql,Map<String, Object> paramMap){
		List<Map<String, Object>> arrayListMaps = new ArrayList<Map<String,Object>>();
		try {
			startTime = System.currentTimeMillis();
			arrayListMaps = namedParameterJdbcTemplate.queryForList(sql, paramMap);
			endTime = System.currentTimeMillis();
		} catch (DataAccessException e) {
			printError(e);
		} finally {
			printSql(sql, paramMap.toString());
		}
		return arrayListMaps;
	}
	
	private void printSql(String sql, String parameters) {
		if (displaySql) {
			log.info("SQL STRING:\"" + sql + "\" Parameters:\"" + parameters + "\"");
			log.info("SQL STARTTIME:" + startTime + " ENDTIME:" + endTime + " USETIME:" + (endTime - startTime));
		}
	}
	
	private void printError(Exception e) {
		log.error("LOG Error:" + e.getMessage());
	}
}

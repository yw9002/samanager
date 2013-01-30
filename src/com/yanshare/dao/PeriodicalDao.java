package com.yanshare.dao;

import java.util.List;
import com.yanshare.entity.Periodical;

public interface PeriodicalDao {
	/**
	 * 获取期列表
	 * @return 获取期列表
	 */
	public List<Periodical> findPeriodicalList();
	/**
	 * 根据期刊名获取期刊信息
	 * @param periodical 要求传入期刊名
	 * @return 期刊对象
	 */
	public Periodical findPeriodicalByName(Periodical periodical);
	/**
	 * 根据关键字返回期刊名称列表
	 * @param key 关键字
	 * @return 期刊名称列表
	 */
	public List<String> findPeriodicalName(String key);
	/**
	 * 添加期刊
	 * @param periodical 期刊对象
	 * @param opt 操作类型
	 * @return 成功添加条数，正常情况为1，失败为0
	 */
	public int addPeriodical(Periodical periodical, String opr);
	/**
	 * 根据ID查找期刊对象
	 * @param periodical 要求传入期刊ID
	 * @return 期刊对象
	 */
	public Periodical findPeriodicalById(Periodical periodical);
	/**
	 * 根据ID删除期刊对象
	 * @param periodical 要求传入期刊ID
	 * @return 成功删除的条数
	 */
	public int delPeriodical(Periodical periodical);
}

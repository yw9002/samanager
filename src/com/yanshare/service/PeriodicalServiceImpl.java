package com.yanshare.service;

import java.util.List;

import com.yanshare.dao.PeriodicalDao;
import com.yanshare.entity.Periodical;

public class PeriodicalServiceImpl implements PeriodicalService {
	private PeriodicalDao periodicalDao;
	public List<Periodical> findPeriodicalList() {
		// TODO Auto-generated method stub
		return periodicalDao.findPeriodicalList();
	}
	public int addPeriodical(Periodical periodical, String opr) {
		// TODO Auto-generated method stub
		return periodicalDao.addPeriodical(periodical, opr);
	}
	public Periodical findPeriodicalByName(Periodical periodical) {
		// TODO Auto-generated method stub
		return periodicalDao.findPeriodicalByName(periodical);
	}

	public List<String> findPeriodicalName(String key) {
		// TODO Auto-generated method stub
		return periodicalDao.findPeriodicalName(key);
	}
	public Periodical findPeriodicalById(Periodical periodical) {
		// TODO Auto-generated method stub
		return periodicalDao.findPeriodicalById(periodical);
	}
	public int delPeriodical(Periodical periodical) {
		// TODO Auto-generated method stub
		return periodicalDao.delPeriodical(periodical);
	}
	
	public PeriodicalDao getPeriodicalDao() {
		return periodicalDao;
	}

	public void setPeriodicalDao(PeriodicalDao periodicalDao) {
		this.periodicalDao = periodicalDao;
	}
	
}

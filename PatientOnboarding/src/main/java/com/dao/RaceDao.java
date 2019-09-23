package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Race;
import com.util.HibernateUtil;

public class RaceDao {

	public static void insert(Race race) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(race);
		
		tx.commit();
	}

	public static List<Race> selectAll() {
		Session ses=HibernateUtil.getSession();
		List<Race> races = ses.createQuery("from race", Race.class).list();
		
		return races;
	}
	
}

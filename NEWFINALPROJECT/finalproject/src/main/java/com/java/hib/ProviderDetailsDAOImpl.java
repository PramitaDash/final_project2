package com.java.hib;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProviderDetailsDAOImpl implements ProviderDetailsDAO {
	
	SessionFactory sf;
	Session session;

	@Override
	public List<ProviderDetails> showProviderDetails() {
		// TODO Auto-generated method stub
		sf = SessionHelper.getConnection();
		session=sf.openSession();
		Criteria cr = session.createCriteria(ProviderDetails.class);
		List<ProviderDetails> ProviderList=cr.list();
		return ProviderList;
	}

	@Override
	public String searchProviderDetails(String providerid) {
		System.out.println("From controller : "+providerid);
		// TODO Auto-generated method stub
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext()
				.getSessionMap();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from ProviderDetails where providerid="+providerid);
		List<ProviderDetails> providerList = query.list();
		ProviderDetails provider = providerList.get(0);
		sessionMap.put("editProvider", provider);
		return"UpdateProviderDetails.jsp?faces-redirect=true";
	}

	@Override
	public String updateProviderDetails(ProviderDetails ProviderDetailsUpdate) {
		// TODO Auto-generated method stub
//		System.out.println("x: "+ProviderDetailsUpdate);
		System.out.println("Inside update provider details");
		
	     
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.update(ProviderDetailsUpdate);
		trans.commit();
		return "ShowProviderDetails.jsp?faces-redirect=true";
	}
	
	public List<ProviderDetails> getListOfProvider(int firstRow, int rowCount) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		List<Patientenrollment> cdList = null;
			session.beginTransaction();
			Criteria criteria = session.createCriteria(ProviderDetails.class);
			criteria.setFirstResult(firstRow);
			criteria.setMaxResults(rowCount);
		return criteria.list();
	}
	
	public int countRows() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(ProviderDetails.class);
			if (criteria != null) {
				return criteria.list().size();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}

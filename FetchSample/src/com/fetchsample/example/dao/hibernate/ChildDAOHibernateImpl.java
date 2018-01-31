package com.fetchsample.example.dao.hibernate;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.fetchsample.example.dao.ChildDAO;
import com.fetchsample.example.domain.Child;

/**
 * The hibernate implementation of our {@link ChildDAO} interface
 * 
 * @author dinuka.arseculeratne
 * 
 */
public class ChildDAOHibernateImpl extends HibernateDaoSupport implements
		ChildDAO {

	/**
	 * {@inheritDoc}
	 */
	public void persistChild(Child child) {
		getHibernateTemplate().persist(child);
	}

	/**
	 * {@inheritDoc}
	 */
	public Child getChildByIdWithoutToys(Long childId) {
		return getHibernateTemplate().get(Child.class, childId);
	}

	/**
	 * {@inheritDoc}
	 */
	public Child getChildByIdWithToys(Long childId) {
		Child child = getChildByIdWithoutToys(childId);
		/**
		 * Since by default the toys are not loaded, we call the hibernate
		 * template's initialize method to populate the toys list of that
		 * respective child.
		 */
		getHibernateTemplate().initialize(child.getToyList());
		return child;
	}

	/**
	 * {@inheritDoc}
	 */
	public Child getChildByNameWithToys(String childName) {
		return (Child) getHibernateTemplate().findByNamedQueryAndNamedParam(
				Child.Constants.FIND_CHILD_BY_NAME_QUERY,
				Child.Constants.CHILD_NAME_PARAM, childName).get(0);

	}

}

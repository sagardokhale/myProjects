package com.fetchsample.example.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fetchsample.example.domain.Child;

/**
 * The basic contract for dealing with the {@link Child} entity
 * 
 * @author dinuka.arseculeratne
 * 
 */
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public interface ChildDAO {

	/**
	 * This method will create a new instance of a child in the child table
	 * 
	 * @param child
	 *            the entity to be persisted
	 */
	public void persistChild(Child child);

	/**
	 * Retrieves a child without his/her toys
	 * 
	 * @param childId
	 *            the primary key of the child table
	 * @return the child with the ID passed in if found
	 */
	public Child getChildByIdWithoutToys(Long childId);

	/**
	 * Retrieves the child with his/her toys
	 * 
	 * @param childId
	 *            the primary key of the child table
	 * @return the child with the ID passed in if found
	 */
	public Child getChildByIdWithToys(Long childId);

	/**
	 * Retrieves the child by the name and with his/her toys
	 * 
	 * @param childName
	 *            the name of the child
	 * @return the child entity that matches the name passed in
	 */
	public Child getChildByNameWithToys(String childName);

}

package com.tecgurus.contact_list.dao;

import java.util.List;

import com.tecgurus.contact_list.model.Contact;

public interface IContactDao extends CRUD<Contact,Long>{
	List<Contact> listAll();
	int count();
}

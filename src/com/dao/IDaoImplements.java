package com.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.util.SingletonDbConnection;

//gövdesiz metot ancak default ve static hariç
//interface,generics,Collection,nteface gövdeli metot
public interface IDaoImplements<T> {

	void create(T t);

	void update(T t);

	void delete(T t);

	ArrayList<T> list();

	default Connection getInterfaceConnection() {
		return SingletonDbConnection.getInstance().getConnection();
	}

}

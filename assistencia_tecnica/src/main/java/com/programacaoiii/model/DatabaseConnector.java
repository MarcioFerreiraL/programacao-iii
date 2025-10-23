package com.programacaoiii.model;

import java.sql.Connection;

public class DatabaseConnector {

	private static DatabaseConnector instance;
	private Connection connection;
	
	private void DatabaseConnector() {
		
	}

	public static DatabaseConnector getInstance() {
		return instance;
	}
	
}

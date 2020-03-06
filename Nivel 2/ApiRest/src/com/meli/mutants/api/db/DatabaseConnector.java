package com.meli.mutants.api.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.meli.mutants.api.utils.MutantUtils;

/**
 * Clase para obtener la conexion con la base de datos.
 * Los datos de conexion son tomados de WEB-INF/application.properties.
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class DatabaseConnector {

	private static String conString = MutantUtils.buildDbConnectionStringForLocal();
	private static final Logger log = Logger.getLogger(DatabaseConnector.class.getName());


	public static Connection getConnection() throws SQLException {
		log.warning("Connection String: " + conString);
		
		return	DriverManager.getConnection(conString);
	}
}

package com.meli.mutants.api.localization;


/**
 * Constantes utilizadas en la api.
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public interface MutantConstants {

	public static final String OK = "OK";
	public static final String DNA = "dna";
	public static final String FORBIDDEN = "Forbidden";
	public static final String USER = "user";
	public static final String PASSWORD = "password";
	public static final String BAD_REQUEST_MESSAGE = "Bad Request: Resquest invalida";
	public static final String YES = "YES";
	public static final String NO = "NO";
	public static final String QUERY_SAVE_DNA = "INSERT INTO `dna_history` (`DNA_JSON_REQUEST`,`DNA_ARRAY` ,`DNA_MUTANT`) VALUES (?,?,?)";
	public static final String QUERY_STATS = "SELECT `COUNT_MUTANT_DNA`, `COUNT_HUMAN_DNA`, `RATIO` FROM `dna_stats` WHERE `DNA_STATS_ID` = ?";
	public static final String SERVER_TIMEZONE = "serverTimezone";
	public static final String DB_CONNECTOR = "db.connector";
	public static final String DB_LOCAL_CONNECTOR = "db.local.connector";
	public static final String DB_NAME = "db.name";
	public static final String DB_LOCAL_SERVER_TIMEZONE = "db.local.serverTimezone";
	public static final String DB_URL = "db.url";
	public static final String DB_LOCAL_URL = "db.local.url";
	public static final String DB_LOCAL_PORT = "db.local.port";
	public static final String DB_USER = "db.user";
	public static final String DB_PASSWORD = "db.password";
	public static final String COUNT_MUTANT_DNA = "count_mutant_dna";
	public static final String COUNT_HUMAN_DNA = "count_human_dna";
	public static final String RATIO = "ratio";
	public static final String APPLICATION_PROPERTIES_PATH = "WEB-INF/application.properties";

}

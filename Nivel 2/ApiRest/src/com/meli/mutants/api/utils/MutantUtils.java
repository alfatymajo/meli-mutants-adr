package com.meli.mutants.api.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.meli.mutants.api.localization.MutantConstants;

/**
 * Clase con los metodos utiles para el servicio "/mutant"
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class MutantUtils {
	
	public static final File APP_PROPERTIES_FILE = new File(MutantConstants.APPLICATION_PROPERTIES_PATH);
	private static final Logger log = Logger.getLogger(MutantUtils.class.getName());

	/**
	 * Metodo para transformar el dna enviado al servicio en formato JSON 
	 * a un array de String.
	 * NOTA: Si salta una excepcion del tipo JSONException y no puede realizar la
	 * conversion retornara null.
	 * @param jsonRequest
	 * @return
	 */
	public static String[] extractDnaFromRequest(String jsonRequest) {
		Vector dnaBuilder = new Vector<>();
		boolean jsonExceptionOccurs = false;
		try {

			JSONArray dna = extractJsonArrayFromRequest(jsonRequest);

			for (int i = 0; i < dna.length(); i++) {
				dnaBuilder.add(dna.getString(i));
			}

		} catch (JSONException e) {
			jsonExceptionOccurs = true;
		}

		
		
		
		if (!jsonExceptionOccurs) {
			Object[] objArray = dnaBuilder.toArray();
			String[] objArrayParsed =  Arrays.copyOf(objArray, objArray.length,  String[].class);
			
			return objArrayParsed;
			
		}else {
			return null;
		}
		
	}
	
	/**
	 * Metodo para extraer un objeto JSONArray del request enviado al servicio.
	 * @param jsonRequest
	 * @return JSONArray
	 */
	public static JSONArray extractJsonArrayFromRequest(String jsonRequest) {
		
		JSONObject jObj = new JSONObject(jsonRequest);
		JSONArray jsonArray = jObj.getJSONArray(MutantConstants.DNA);
		
		return jsonArray;
	}
	
	/**
	 * Metodo para armar el connection string de la BD con los datos de WEB-INF/application.properties.
	 */
	public static String buildDbConnectionString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getProperty(MutantConstants.DB_CONNECTOR));
		builder.append(getProperty(MutantConstants.DB_URL));
		builder.append("/");
		builder.append(getProperty(MutantConstants.DB_NAME));
		builder.append("?");
		builder.append(MutantConstants.USER);
		builder.append("=");
		builder.append(getProperty(MutantConstants.DB_USER));
		builder.append("&");
		builder.append(MutantConstants.PASSWORD);
		builder.append("=");
		builder.append(getProperty(MutantConstants.DB_PASSWORD));
		
		
		return builder.toString();
	}
	
	public static String buildDbConnectionStringForLocal() {
		StringBuilder builder = new StringBuilder();
		builder.append(getProperty(MutantConstants.DB_LOCAL_CONNECTOR));
		builder.append(getProperty(MutantConstants.DB_LOCAL_URL));
		builder.append(":");
		builder.append(getProperty(MutantConstants.DB_LOCAL_PORT));
		builder.append("/");
		builder.append(getProperty(MutantConstants.DB_NAME));
		builder.append("?");
		builder.append(MutantConstants.USER);
		builder.append("=");
		builder.append(getProperty(MutantConstants.DB_USER));
		builder.append("&");
		builder.append(MutantConstants.PASSWORD);
		builder.append("=");
		builder.append(getProperty(MutantConstants.DB_PASSWORD));
		builder.append("&");
		builder.append(MutantConstants.SERVER_TIMEZONE);
		builder.append("=");
		builder.append(getProperty(MutantConstants.DB_LOCAL_SERVER_TIMEZONE));
		
		
		return builder.toString();
	}
	
	/**
	 * Metodo para extraer el valor de una propiedad definida en WEB-INF/application.properties
	 * en base a la key pasada por parametro.
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		
		String resultValue = null;
		
		try (InputStream input = new FileInputStream(APP_PROPERTIES_FILE)) {
		
			 Properties prop = new Properties();
			 
	            prop.load(input);
	            resultValue = prop.getProperty(key);

			
		} catch (IOException e) {
			
			log.warning("getProperty: " + e.getMessage());
		}
		
		return resultValue;
	}
	
	
}

package com.meli.mutants.api.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.json.JSONObject;
import org.json.JSONArray;

import com.meli.mutants.api.localization.MutantConstants;
import com.meli.mutants.api.utils.MutantUtils;

/**
 * Clase que se encargara de manejar las interacciones con la base de datos.
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class DatabaseManager {
	private static JSONObject statsJsonResponse = new JSONObject();
	private static final Logger log = Logger.getLogger(DatabaseManager.class.getName());
	
	/**
	 * Metodo para persistir el DNA en la BD.
	 * Utilizado por el servicio /mutant
	 * @param isMutant
	 * @throws SQLException 
	 */
	public static void saveDna(boolean isMutant, String dna)  {
		JSONArray jsonArray = MutantUtils.extractJsonArrayFromRequest(dna);
		Connection cn = null;
		PreparedStatement pstm = null;
		try {

			cn = DatabaseConnector.getConnection();

			pstm = cn.prepareStatement(MutantConstants.QUERY_SAVE_DNA);
			pstm.setString(1, dna);
			pstm.setString(2, jsonArray.toString());
			pstm.setString(3, (isMutant?MutantConstants.YES:MutantConstants.NO));
			pstm.executeUpdate();

		} catch (SQLException e) {
			log.warning("saveDna primer catch: " + e.getMessage());
		} finally {
			
			try {

				if (pstm != null) {
					pstm.close();
				}

				if (cn != null) {
					cn.close();
				}

			} catch (SQLException e) {
				log.warning("saveDna finally: " + e.getMessage());
			}
		
		}

	}
	
	/**
	 * Metodo para obtener las estadisticas de los DNA consultados por la api.
	 * Es utilizado por el servicio /stats.
	 * @return String con los stats en formato json.
	 */
	public static String getStats() {
		
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {

			cn = DatabaseConnector.getConnection();

			pstm = cn.prepareStatement(MutantConstants.QUERY_STATS);
			pstm.setInt(1, 1);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				int countMutantDna = rs.getInt(1);
				int countHumanDna = rs.getInt(2);
				float ratio = rs.getFloat(3);

				statsJsonResponse.put(MutantConstants.COUNT_MUTANT_DNA, countMutantDna);
				statsJsonResponse.put(MutantConstants.COUNT_HUMAN_DNA, countHumanDna);
				statsJsonResponse.put(MutantConstants.RATIO, ratio);
			}

		} catch (SQLException e) {
			log.warning("getStats primer catch: " + e.getMessage());
		} finally {
			if (rs != null) {
				try {
					if (rs != null) {
						rs.close();
					}

					if (pstm != null) {
						pstm.close();
					}

					if (cn != null) {
						cn.close();
					}

				} catch (SQLException e) {
					log.warning("getStats finally: " + e.getMessage());
				}
			}
		}
		
		
		return statsJsonResponse.toString();
	}

}

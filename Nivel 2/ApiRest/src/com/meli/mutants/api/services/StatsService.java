package com.meli.mutants.api.services;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import com.meli.mutants.api.db.DatabaseManager;
/**
 * Servicio /stats de la api.
 * Servira al cliente las estadisticas de DNA registrados por la API
 * en un String con formato JSON
 * @author Alexis Rodriguez - DNI 35.094.185
 */
@Path("/stats")
public class StatsService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStats() {
		
		return DatabaseManager.getStats();
	}

}

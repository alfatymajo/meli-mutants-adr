package com.meli.mutants.api.services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType; 
import javax.ws.rs.core.Response;

import com.meli.mutants.api.db.DatabaseManager;
import com.meli.mutants.api.localization.MutantConstants;
import com.meli.mutants.api.utils.MutantUtils;
import com.meli.mutants.exceptions.InvalidDNAContentException;
import com.meli.mutants.exceptions.InvalidDNADimensionException;
import com.meli.mutants.home.ServiceHome;
import com.meli.mutants.utils.DNAUtils;
import com.meli.mutants.utils.DNAValidations;

/**
 * Servicio /mutant de la api.
 * Respondera al cliente si el DNA consultado corresponde a un Mutante o Ser Humano.
 * Luego de poder verificar el DNA correctamente lo persistira en la base de datos.
 * Luego de persistir exitosamente se lanzara un trigger en la BD para actualizar
 * las estadisticas de registros.
 * @author Alexis Rodriguez - DNI 35.094.185
 */
@Path("/mutant")
public class MutantService {

	private static final Response RESP_OK = Response.status(200, MutantConstants.OK).build();
	private static final Response RESP_FORBIDDEN = Response.status(403, MutantConstants.FORBIDDEN).build();
	private static final Response RESP_BAD_REQUEST = Response.status(400, MutantConstants.BAD_REQUEST_MESSAGE).build();	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response isMutant(String rq) {

		boolean isMutantDna = false;
		
		String[] dna = MutantUtils.extractDnaFromRequest(rq);
		
		if  (dna == null) {
			return RESP_BAD_REQUEST;
		}
		String[] dnaToConsult = DNAUtils.DNAToUpperCase(dna);
		try {
			DNAValidations.checkDnaFormat(dnaToConsult);
		} catch (InvalidDNADimensionException e) {
			return RESP_BAD_REQUEST;
		} catch (InvalidDNAContentException e) {
			return RESP_BAD_REQUEST;
		}
		
		isMutantDna = ServiceHome.isMutant(dnaToConsult);
		
		DatabaseManager.saveDna(isMutantDna,rq);
		
		if (isMutantDna){
			
			return RESP_OK;
		}
		
		
		return RESP_FORBIDDEN;
		
	}
}

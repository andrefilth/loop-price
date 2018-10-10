package br.com.loop.pi.price.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loop.pi.price.adapter.mapper.SuivDTOMapper;
import br.com.loop.pi.price.adapter.outbound.client.SuivClient;
import br.com.loop.pi.price.adapter.outbound.model.SuivModel;
import br.com.loop.pi.price.core.client.dto.SuivDTO;
import br.com.loop.pi.price.core.port.outbound.PricePortOutboundDB;

/**
 * @author André Franco on /04/18.
 */

@Service
public class PricePortAdapter implements PricePortOutboundDB {

	
	private static final Logger log = LoggerFactory.getLogger(PricePortAdapter.class);


	@Autowired
	private SuivClient suivClient;
	
	@Override
	public SuivDTO findBy(String board) {
		log.info("Chamando serviço do SUIV: " + SuivClient.URL + " " + board);
		SuivModel suivModel = suivClient.findby(board);
		log.info("Informações da placa recuperado: " + suivModel);
		//converter valores.
		SuivDTO suivDTO = SuivDTOMapper.fromEntityToDTO(suivModel);
		
		
		return suivDTO;
	}

	

}
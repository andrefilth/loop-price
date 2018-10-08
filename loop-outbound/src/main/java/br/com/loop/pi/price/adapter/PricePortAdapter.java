package br.com.loop.pi.price.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loop.pi.price.adapter.outbound.client.Cep;
import br.com.loop.pi.price.adapter.outbound.client.SuivClient;
import br.com.loop.pi.price.adapter.outbound.vo.Endereco;
import br.com.loop.pi.price.core.client.DTO.CarDTO;
import br.com.loop.pi.price.core.port.outbound.PricePortOutboundDB;
import br.com.loop.pi.price.core.vo.PriceVO;

/**
 * @author Eli Gomes on 26/04/18.
 */

@Service
public class PricePortAdapter implements PricePortOutboundDB {

	
	private static final Logger log = LoggerFactory.getLogger(PricePortAdapter.class);


	@Autowired
	private SuivClient suivClient;
	
	@Override
	public PriceVO findBoard(String board) {
		log.info("Chamando serviço do SUIV");
		CarDTO carDTO = suivClient.findRequest();
		
		System.out.println("Carro : " + carDTO);
		
		return null;
	}

	

}
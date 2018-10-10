package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Dimensoes;
import br.com.loop.pi.price.core.client.dto.DimensoesDTO;

public class DimensoesDTOMapper {
	
	private static final Logger log = LoggerFactory.getLogger(DimensoesDTOMapper.class);


	public static DimensoesDTO fromEntityToDTO(Dimensoes model) {
		log.info("Iniciando conversão da entidade Dimensoes para DimensoesDTO");
		DimensoesDTO dto = new DimensoesDTO();
		dto.setPeso(model.getPeso());
		dto.setPortaMalas(model.getPortaMalas());
		dto.setTanqueDeCombustivel(model.getTanqueDeCombustivel());
		log.info("Fim conversão da entidade Dimensoes para DimensoesDTO");
		return dto;
	}

}

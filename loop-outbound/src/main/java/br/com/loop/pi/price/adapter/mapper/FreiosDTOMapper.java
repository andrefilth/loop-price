package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Freios;
import br.com.loop.pi.price.core.client.dto.FreiosDTO;

public class FreiosDTOMapper {
	
	private static final Logger log = LoggerFactory.getLogger(FreiosDTOMapper.class);


	public static FreiosDTO fromEntityToDTO(Freios model) {
		log.info("Iniciando conversão da entidade Freios para FreiosDTO");
		FreiosDTO dto = new FreiosDTO();
		dto.setDianteiros(model.getDianteiros());
		dto.setTraseiros(model.getTraseiros());

		return dto;
	}

}

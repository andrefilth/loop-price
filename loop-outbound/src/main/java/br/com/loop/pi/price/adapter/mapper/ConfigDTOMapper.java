package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Config;
import br.com.loop.pi.price.core.client.dto.ConfigDTO;

public class ConfigDTOMapper {

	private static final Logger log = LoggerFactory.getLogger(ConfigDTOMapper.class);

	public static ConfigDTO fromEntityToDTO(Config model) {
		log.info("Iniciando conversão da entidade Config para ConfigDTO");
		ConfigDTO dto = new ConfigDTO();
		dto.setComplementExists(model.getComplementExists());
		dto.setComplementFounds(model.getComplementFounds());
		dto.setPartsExists(model.getPartsExists());
		log.info("Fim da conversão da entidade Config para ConfigDTO");
		return dto;
	}

}

package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Consumo;
import br.com.loop.pi.price.core.client.dto.ConsumoDTO;

public class ConsumoDTOMapper {

	
	private static final Logger log = LoggerFactory.getLogger(ConsumoDTOMapper.class);

	public static ConsumoDTO fromEntityToDTO(Consumo model) {
		log.info("Iniciando conversão da entidade Consumo para ConsumoDTO");
		ConsumoDTO dto = new ConsumoDTO();			
		dto.setRodoviario(model.getRodoviario());
		dto.setUrbano(model.getUrbano());
		log.info("Fim conversão da entidade Consumo para ConsumoDTO");
		return dto;
	}

}

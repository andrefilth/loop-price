package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Desempenho;
import br.com.loop.pi.price.core.client.dto.DesempenhoDTO;

public class DesempenhoDTOMapper {
	
	private static final Logger log = LoggerFactory.getLogger(DesempenhoDTOMapper.class);


	public static DesempenhoDTO fromEntityToDTO(Desempenho model) {
		log.info("Iniciando conversão da entidade Desempenho para DesempenhoDTO");
		DesempenhoDTO dto = new DesempenhoDTO();
		dto.setVelocidadeMaxima(model.getVelocidadeMaxima());
		log.info("Iniciando conversão da entidade Desempenho para DesempenhoDTO");
		return dto;
	}

}

package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Direcao;
import br.com.loop.pi.price.core.client.dto.DirecaoDTO;

public class DirecaoDTOMapper {
	
	private static final Logger log = LoggerFactory.getLogger(DirecaoDTOMapper.class);


	public static DirecaoDTO fromEntityToDTO(Direcao model) {
		log.info("Iniciando conversão da entidade Direcao para DirecaoDTO");
		DirecaoDTO dto = new DirecaoDTO();
		dto.setAssistencia(model.getAssistencia());
		dto.setPneusDianteiros(model.getPneusDianteiros());
		dto.setPneusTraseiros(model.getPneusTraseiros());
		log.info("Fim conversão da entidade Direcao para DirecaoDTO");
		return dto;
	}

}

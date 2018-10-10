package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Transmissao;
import br.com.loop.pi.price.core.client.dto.TransmissaoDTO;

public class TransmissaoDTOMapper {
	
	private static final Logger log = LoggerFactory.getLogger(TransmissaoDTOMapper.class);


	public static TransmissaoDTO fromEntityToDTO(Transmissao model) {
		log.info("Iniciando conversão da entidade Transmissao para TransmissaoDTO");
		TransmissaoDTO dto = new TransmissaoDTO();
		dto.setCambio(model.getCambio());
		dto.setTracao(model.getTracao());
		log.info("Iniciando conversão da entidade Transmissao para TransmissaoDTO");
		return dto;
	}

}

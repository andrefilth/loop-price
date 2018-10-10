package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.FichaTecnica;
import br.com.loop.pi.price.core.client.dto.FichaTecnicaDTO;

public class FichaTecnicaDTOMapper {

	
	private static final Logger log = LoggerFactory.getLogger(FichaTecnicaDTOMapper.class);

	public static FichaTecnicaDTO fromEntityToDTO(FichaTecnica model) {
		log.info("Iniciando conversão da entidade FichaTecnica para FichaTecnicaDTO");
		FichaTecnicaDTO dto = new FichaTecnicaDTO();
		dto.setConfiguracao(model.getConfiguracao());
		dto.setOcupantes(model.getOcupantes());
		dto.setPortas(model.getPortas());
		log.info("Iniciando conversão da entidade FichaTecnica para FichaTecnicaDTO");
		return dto;
	}

}

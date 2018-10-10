package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.CatalogoPecas;
import br.com.loop.pi.price.core.client.dto.CatalogoPecasDTO;

public class CatalogoPecasDTOMapper {

	private static final Logger log = LoggerFactory.getLogger(CatalogoPecasDTOMapper.class);

	public static CatalogoPecasDTO fromEntityToDTO(CatalogoPecas model) {
		log.info("Iniciando conversão da entidade CatalogoPecas para CatalogoPecasDTO");
		CatalogoPecasDTO dto = new CatalogoPecasDTO();
		try {
			if (model != null) {
				dto.setIdMontadora(model.getIdMontadora());
				dto.setIdModelo(model.getIdModelo());
				dto.setModeloSuiv(model.getModeloSuiv());
				dto.setIdVersao(model.getIdVersao());
				dto.setRangeInicial(model.getRangeInicial());
				dto.setRangeFinal(model.getRangeFinal());
			}
		} catch (Exception e) {
			log.info("Falha ao converter Entity para DTO: " + model);
			log.info("Error: " + e);
			throw new RuntimeException("Falha ao converter Entity para DTO: " + model);
		}
		log.info("Fim da conversão da entidade CatalogoPecas para CatalogoPecasDTO");
		return dto;
	}

}

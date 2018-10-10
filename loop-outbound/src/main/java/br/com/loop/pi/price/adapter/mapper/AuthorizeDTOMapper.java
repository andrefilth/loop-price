package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Authorize;
import br.com.loop.pi.price.core.client.dto.AuthorizeDTO;

public class AuthorizeDTOMapper {

	private static final Logger log = LoggerFactory.getLogger(AuthorizeDTOMapper.class);

	public static AuthorizeDTO fromEntityToDTO(Authorize model) {
		log.info("Iniciando conversão da entidade Authorize para AuthorizeDTO");
		AuthorizeDTO dto = new AuthorizeDTO();
		try {
			if (model != null) {
				dto.setEmail(model.getEmail());
				dto.setNome(model.getNome());
				dto.setRequests(model.getRequests());
				dto.setToken(model.getToken());
			}
		} catch (Exception e) {
			log.info("Falha ao converter Entity para DTO: " + model);
			log.info("Error: " + e);
			throw new RuntimeException("Falha ao converter Entity para DTO: " + model);
		}
		log.info("Fim conversão da entidade Authorize para AuthorizeDTO");
		return dto;
	}

}

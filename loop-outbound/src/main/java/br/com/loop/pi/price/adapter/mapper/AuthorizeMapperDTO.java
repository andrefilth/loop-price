package br.com.loop.pi.price.adapter.mapper;

import br.com.loop.pi.price.adapter.outbound.model.Authorize;
import br.com.loop.pi.price.core.client.dto.AuthorizeDTO;

public class AuthorizeMapperDTO {

	public static AuthorizeDTO fromEntityToDTO(Authorize authorize) {
		AuthorizeDTO dto = new AuthorizeDTO();
		dto.setEmail(authorize.getEmail());
		dto.setNome(authorize.getNome());
		dto.setRequests(authorize.getRequests());
		dto.setToken(authorize.getToken());
		return dto;
	}

}

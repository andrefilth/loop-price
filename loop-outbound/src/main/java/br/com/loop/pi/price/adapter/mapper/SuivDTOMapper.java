package br.com.loop.pi.price.adapter.mapper;

import br.com.loop.pi.price.adapter.outbound.model.SuivModel;
import br.com.loop.pi.price.core.client.dto.SuivDTO;

public class SuivDTOMapper {

	public static SuivDTO fromEntityToDTO(SuivModel suivModel) {
		SuivDTO dto = new SuivDTO();
		dto.setAuthorize(AuthorizeMapperDTO.fromEntityToDTO(suivModel.getAuthorize()));

		return dto;
	}

}

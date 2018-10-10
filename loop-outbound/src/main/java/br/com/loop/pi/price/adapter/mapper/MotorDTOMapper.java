package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Motor;
import br.com.loop.pi.price.core.client.dto.MotorDTO;

public class MotorDTOMapper {

	private static final Logger log = LoggerFactory.getLogger(MotorDTOMapper.class);

	public static MotorDTO fromEntityToDTO(Motor model) {
		log.info("Iniciando conversão da entidade Motor para MotorDTO");
		MotorDTO dto = new MotorDTO();
		dto.setAspiracao(model.getAspiracao());
		dto.setCilindros(model.getCilindros());
		dto.setDisposicao(model.getDisposicao());
		dto.setInstalacao(model.getInstalacao());
		dto.setValvulasPorCilindro(model.getValvulasPorCilindro());
		log.info("Fim conversão da entidade Motor para MotorDTO");
		return dto;
	}

}

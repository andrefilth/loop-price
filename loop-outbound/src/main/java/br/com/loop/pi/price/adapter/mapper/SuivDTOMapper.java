package br.com.loop.pi.price.adapter.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.SuivModel;
import br.com.loop.pi.price.core.client.dto.SuivDTO;

public class SuivDTOMapper {
	
	
	private static final Logger log = LoggerFactory.getLogger(SuivDTOMapper.class);


	public static SuivDTO fromEntityToDTO(SuivModel model) {
		log.info("Iniciando conversão da entidade  SuivModel para SuivDTO");
		SuivDTO dto = new SuivDTO();
		dto.setAuthorize(AuthorizeDTOMapper.fromEntityToDTO(model.getAuthorize()));
		dto.setPlaca(model.getPlaca());
		dto.setMarca(model.getMarca());
		dto.setModelo(model.getModelo());
		dto.setVersao(model.getVersao());
		dto.setMotorizacao(model.getMotorizacao());
		dto.setChassis(model.getChassis());
		dto.setAnoFab(model.getAnoFab());
		dto.setCombustivel(model.getCombustivel());
		dto.setSegmento(model.getSegmento());
		dto.setSubsegmento(model.getSubsegmento());
		dto.setCarroceria(model.getCarroceria());
		dto.setPotencia(model.getPotencia());
		dto.setProcedencia(model.getProcedencia());
		dto.setEixosQtd(model.getEixosQtd());
		dto.setpBT(model.getpBT());
		dto.setCilindradas(model.getCilindradas());
		dto.setNumLugares(model.getNumLugares());
		dto.setCapacCarga(model.getCapacCarga());
		dto.setNumCaixaCambio(model.getNumCaixaCambio());
		dto.setNumEixoTras(model.getNumEixoTras());
		dto.setNumMotor(model.getNumMotor());
		dto.setRelatedFipe(model.getRelatedFipe());
		dto.setConfigDTO(ConfigDTOMapper.fromEntityToDTO(model.getConfig()));
		dto.setComplementoDTO(ComplementoDTOMapper.fromEntityToDTO(model.getComplemento()));
		log.info("Fim da conversão da entidade  SuivModel para SuivDTO");
		return dto;
	}

}

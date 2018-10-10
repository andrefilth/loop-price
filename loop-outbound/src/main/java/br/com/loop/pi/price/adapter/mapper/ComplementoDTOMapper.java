package br.com.loop.pi.price.adapter.mapper;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.loop.pi.price.adapter.outbound.model.Complemento;
import br.com.loop.pi.price.core.client.dto.ComplementoDTO;

public class ComplementoDTOMapper {

	private static final Logger log = LoggerFactory.getLogger(ComplementoDTOMapper.class);

	public static List<ComplementoDTO> fromEntityToDTO(List<Complemento> complementos) {
		log.info("Iniciando conversão da entidade uma lista de Complemento lista de  para ComplementoDTO");
		List<ComplementoDTO> list = new LinkedList<>();
		complementos.forEach(complemento -> {
			ComplementoDTO dto = new ComplementoDTO();
			try {
				dto.setFipe(complemento.getFipe());
				dto.setDescVersao(complemento.getDescVersao());
				dto.setDescAno(complemento.getDescAno());
				dto.setCombustivel(complemento.getCombustivel());
				dto.setPreco(complemento.getPreco());
				dto.setCatalogoPecasDTO(CatalogoPecasDTOMapper.fromEntityToDTO(complemento.getCatalogoPecas()));
				dto.setFichaTecnicaDTO(FichaTecnicaDTOMapper.fromEntityToDTO(complemento.getFichaTecnica()));
				dto.setMotorDTO(MotorDTOMapper.fromEntityToDTO(complemento.getMotor()));
				dto.setTransmissaoDTO(TransmissaoDTOMapper.fromEntityToDTO(complemento.getTransmissao()));
				dto.setFreiosDTO(FreiosDTOMapper.fromEntityToDTO(complemento.getFreios()));
				dto.setDirecaoDTO(DirecaoDTOMapper.fromEntityToDTO(complemento.getDirecao()));
				dto.setDimensoesDTO(DimensoesDTOMapper.fromEntityToDTO(complemento.getDimensoes()));
				dto.setDesempenhoDTO(DesempenhoDTOMapper.fromEntityToDTO(complemento.getDesempenho()));
				dto.setConsumoDTO(ConsumoDTOMapper.fromEntityToDTO(complemento.getConsumo()));
				
			} catch (Exception e) {
				log.info("Falha ao converter Entity para DTO: " + complemento);
				log.info("Error: " + e);
				throw new RuntimeException("Falha ao converter Entity para DTO: " + complemento);
			}
			list.add(dto);
		});
		log.info("Iniciando conversão da entidade uma lista de Complemento lista de  para ComplementoDTO");
		return list;
	}

}

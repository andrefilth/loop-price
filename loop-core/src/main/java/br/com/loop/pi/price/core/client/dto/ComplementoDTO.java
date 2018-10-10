package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class ComplementoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String fipe;

	private String descVersao;

	public String descAno;

	private String combustivel;

	private String preco;

	private CatalogoPecasDTO catalogoPecasDTO;

	private FichaTecnicaDTO fichaTecnicaDTO;

	private MotorDTO motorDTO;

	private TransmissaoDTO transmissaoDTO;

	private FreiosDTO freiosDTO;

	private DirecaoDTO direcaoDTO;

	private DimensoesDTO dimensoesDTO;

	private DesempenhoDTO desempenhoDTO;

	private ConsumoDTO consumoDTO;

	public String getFipe() {
		return fipe;
	}

	public void setFipe(String fipe) {
		this.fipe = fipe;
	}

	public String getDescVersao() {
		return descVersao;
	}

	public void setDescVersao(String descVersao) {
		this.descVersao = descVersao;
	}

	public String getDescAno() {
		return descAno;
	}

	public void setDescAno(String descAno) {
		this.descAno = descAno;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public CatalogoPecasDTO getCatalogoPecasDTO() {
		return catalogoPecasDTO;
	}

	public void setCatalogoPecasDTO(CatalogoPecasDTO catalogoPecasDTO) {
		this.catalogoPecasDTO = catalogoPecasDTO;
	}

	public FichaTecnicaDTO getFichaTecnicaDTO() {
		return fichaTecnicaDTO;
	}

	public void setFichaTecnicaDTO(FichaTecnicaDTO fichaTecnicaDTO) {
		this.fichaTecnicaDTO = fichaTecnicaDTO;
	}

	public MotorDTO getMotorDTO() {
		return motorDTO;
	}

	public void setMotorDTO(MotorDTO motorDTO) {
		this.motorDTO = motorDTO;
	}

	public TransmissaoDTO getTransmissaoDTO() {
		return transmissaoDTO;
	}

	public void setTransmissaoDTO(TransmissaoDTO transmissaoDTO) {
		this.transmissaoDTO = transmissaoDTO;
	}

	public FreiosDTO getFreiosDTO() {
		return freiosDTO;
	}

	public void setFreiosDTO(FreiosDTO freiosDTO) {
		this.freiosDTO = freiosDTO;
	}

	public DirecaoDTO getDirecaoDTO() {
		return direcaoDTO;
	}

	public void setDirecaoDTO(DirecaoDTO direcaoDTO) {
		this.direcaoDTO = direcaoDTO;
	}

	public DimensoesDTO getDimensoesDTO() {
		return dimensoesDTO;
	}

	public void setDimensoesDTO(DimensoesDTO dimensoesDTO) {
		this.dimensoesDTO = dimensoesDTO;
	}

	public DesempenhoDTO getDesempenhoDTO() {
		return desempenhoDTO;
	}

	public void setDesempenhoDTO(DesempenhoDTO desempenhoDTO) {
		this.desempenhoDTO = desempenhoDTO;
	}

	public ConsumoDTO getConsumoDTO() {
		return consumoDTO;
	}

	public void setConsumoDTO(ConsumoDTO consumoDTO) {
		this.consumoDTO = consumoDTO;
	}
	
	

}

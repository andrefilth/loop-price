package br.com.loop.pi.price.core.port.outbound;

import br.com.loop.pi.price.core.client.dto.SuivDTO;

public interface PricePortOutboundDB {

	public SuivDTO findBy(String board);

}

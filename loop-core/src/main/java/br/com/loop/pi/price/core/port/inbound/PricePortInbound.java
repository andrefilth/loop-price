package br.com.loop.pi.price.core.port.inbound;

import br.com.loop.pi.price.core.client.dto.SuivDTO;

public interface PricePortInbound {

	public SuivDTO findBoard(String board);

	
}

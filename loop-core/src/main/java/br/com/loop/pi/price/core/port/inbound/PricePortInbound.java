package br.com.loop.pi.price.core.port.inbound;

import br.com.loop.pi.price.core.vo.PriceVO;

public interface PricePortInbound {

	public PriceVO findBoard(String board);

	
}

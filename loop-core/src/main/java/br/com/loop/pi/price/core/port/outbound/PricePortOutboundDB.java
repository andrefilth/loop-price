package br.com.loop.pi.price.core.port.outbound;

import br.com.loop.pi.price.core.vo.PriceVO;

public interface PricePortOutboundDB {

	public PriceVO findBoard(String board);

}

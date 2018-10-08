package br.com.loop.pi.price.core.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loop.pi.price.core.port.inbound.PricePortInbound;
import br.com.loop.pi.price.core.port.outbound.PricePortOutboundDB;
import br.com.loop.pi.price.core.vo.PriceVO;

/**
 * @author Eli Gomes on 26/04/18.
 */

@Service
public class PriceHandler implements PricePortInbound {

	@Autowired
	private PricePortOutboundDB portOutboundDB;

	@Override
	public PriceVO findBoard(String board) {
		return portOutboundDB.findBoard(board);
	}

}

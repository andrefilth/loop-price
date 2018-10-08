package br.com.loop.pi.price.adapter.outbound.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.loop.pi.price.core.client.DTO.CarDTO;

@FeignClient(url = "https://fichatecnica.suiv.com.br/webservice/get/GfZ6xxwOZ6pWSAydhXoG21OG4BdrbZ2x/", name = "findBoard")
public interface SuivClient {

	@GetMapping()
	public CarDTO findBoard(@RequestParam(value = "placa", required = true) String board);
	
	@GetMapping()
	public CarDTO findRequest();
}

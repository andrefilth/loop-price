package br.com.loop.pi.price.adapter.outbound.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.loop.pi.price.adapter.outbound.model.SuivModel;

/**
 * 
 * @author André Franco on 08/10/2018
 *
 */
@FeignClient(url = SuivClient.URL, name = "suiv")
public interface SuivClient {

	@Value("${url.fichatecnica.suiv}")
	public static final String URL = "https://fichatecnica.suiv.com.br/webservice/get/GfZ6xxwOZ6pWSAydhXoG21OG4BdrbZ2x/";

	@GetMapping()
	public SuivModel findby(@RequestParam(value = "placa", required = true) String board);

}

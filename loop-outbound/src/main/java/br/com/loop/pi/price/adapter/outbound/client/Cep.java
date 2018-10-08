package br.com.loop.pi.price.adapter.outbound.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.loop.pi.price.adapter.outbound.vo.Endereco;

@FeignClient(url="https://viacep.com.br/ws/", name = "viacep")
public interface Cep {

	@GetMapping("{cep}/json")
    Endereco buscaEnderecoPor(@PathVariable("cep") String cep);
}

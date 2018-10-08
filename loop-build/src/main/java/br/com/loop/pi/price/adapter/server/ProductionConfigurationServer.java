package br.com.loop.pi.price.adapter.server;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"prod"})
public class ProductionConfigurationServer implements ConfigurationServer {

    @Override
    public String getName() {
        return "Enabled Production Environment";
    }
}

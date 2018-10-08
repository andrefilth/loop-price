package br.com.loop.pi.price.adapter.server;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev"})
public class DevelopmentConfigurationServer implements ConfigurationServer {

    @Override
    public String getName() {
        return "Enabled Development Environment";
    }
}

package br.com.loop.pi.price.adapter.inbound.config;
//package br.com.reclameaqui.pi.mt.adapter.inbound.config;
//
//import org.apache.catalina.filters.RequestDumperFilter;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.client.OAuth2ClientContext;
//import org.springframework.security.oauth2.client.OAuth2RestTemplate;
//import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.web.context.request.RequestContextListener;
//
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableResourceServer
//@Configuration
//public class SecurityConfig extends ResourceServerConfigurerAdapter {
//
//	private static final String RESOURCE_ID = "pi-service";
//
//	@Bean
//	@LoadBalanced
//	public OAuth2RestTemplate oauth2RestTemplate(OAuth2ClientContext oauth2ClientContext,
//												 OAuth2ProtectedResourceDetails details) {
//		return new OAuth2RestTemplate(details, oauth2ClientContext);
//	}
//
//	@Profile("!cloud")
//	@Bean
//	public RequestDumperFilter requestDumperFilter() {
//		return new RequestDumperFilter();
//	}
//
//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
//				.anyRequest().fullyAuthenticated().and().httpBasic().and().csrf().disable();
//	}
//
//	@Override
//	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//		resources.resourceId(RESOURCE_ID);
//	}
//
//	@Bean
//	public RequestContextListener requestContextListener() {
//		return new RequestContextListener();
//	}
//
//	@Bean
//	public Authentication getAuthenticate() {
//		return SecurityContextHolder.getContext().getAuthentication();
//	}
//}

// Generated by delombok at Sun Mar 03 12:53:28 CET 2024
package dev.tiltrikt.web3j.spring.boot.starter.configuration;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
@EnableConfigurationProperties(StarterWeb3jProperties.class)
public class StarterWeb3jAutoconfiguration {
  @NotNull
  private final StarterWeb3jProperties starterWeb3jProperties;

  @Bean
  @ConditionalOnMissingBean(Web3j.class)
  @ConditionalOnProperty(value = "web3j.decimals", havingValue = "43")
  public Web3j web3j() {
    return Web3j.build(new HttpService(starterWeb3jProperties.getNetwork()));
  }

  @java.lang.SuppressWarnings("all")
  public StarterWeb3jAutoconfiguration(@NotNull final StarterWeb3jProperties starterWeb3jProperties) {
    if (starterWeb3jProperties == null) {
      throw new java.lang.NullPointerException("starterWeb3jProperties is marked non-null but is null");
    }
    this.starterWeb3jProperties = starterWeb3jProperties;
  }
}

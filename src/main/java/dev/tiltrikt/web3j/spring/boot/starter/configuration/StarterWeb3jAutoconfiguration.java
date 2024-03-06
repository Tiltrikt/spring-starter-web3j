package dev.tiltrikt.web3j.spring.boot.starter.configuration;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(StarterWeb3jProperties.class)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StarterWeb3jAutoconfiguration {

  @NotNull StarterWeb3jProperties starterWeb3jProperties;

  @Bean
  @ConditionalOnMissingBean(Web3j.class)
  public Web3j web3j() {
    return Web3j.build(new HttpService(starterWeb3jProperties.getNetwork()));
  }
}

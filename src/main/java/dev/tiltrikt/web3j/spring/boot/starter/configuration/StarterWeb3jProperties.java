package dev.tiltrikt.web3j.spring.boot.starter.configuration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "web3j")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StarterWeb3jProperties {

  @NotNull String network;

  @NotNull String contract;

  int decimals;
}

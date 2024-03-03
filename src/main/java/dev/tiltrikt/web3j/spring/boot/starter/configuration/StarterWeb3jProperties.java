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

  @NotNull String network = "https://testnet.ton.dev";

  @NotNull String contract = "0xAD4AdD81B11b4951c87bdb2eb0F4aC8e0fE06712";

  int decimals = 18;
}

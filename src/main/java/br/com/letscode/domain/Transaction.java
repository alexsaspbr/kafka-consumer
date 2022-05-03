package br.com.letscode.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Transaction {

    private String pan;
    private Client client;
    private String description;
    private Brand brand;
    private BigDecimal amount;
    private LocalDateTime timestamp;

}

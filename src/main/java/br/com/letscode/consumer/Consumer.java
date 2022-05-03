package br.com.letscode.consumer;

import br.com.letscode.domain.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(groupId = "consumer-id", topics = "${topic}")
    public void consume(Transaction transaction) {

        System.out.println(transaction.toString());

    }

}

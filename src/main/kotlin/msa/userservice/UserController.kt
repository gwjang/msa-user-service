package msa.userservice

import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController (
    private val kafkaProducer: KafkaProducer
){
    @PostMapping()
    fun sendMessages(@RequestBody message: String) {
        kafkaProducer.sendMessage(message)
    }
}

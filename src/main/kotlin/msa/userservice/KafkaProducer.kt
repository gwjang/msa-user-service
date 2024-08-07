package msa.userservice

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service


@Service
class KafkaProducer (
    private val kafkaTemplate: KafkaTemplate<String, String>
){
    companion object {
        private const val TOPIC = "exam-topic"
    }
    fun sendMessage(message: String) {
        kafkaTemplate.send(TOPIC, message)
    }
}

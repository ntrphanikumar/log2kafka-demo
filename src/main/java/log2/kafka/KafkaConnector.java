package log2.kafka;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaConnector {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");
        Producer<byte[], byte[]> producer = new KafkaProducer<byte[], byte[]>(props);
        producer.send(new ProducerRecord<byte[], byte[]>("log2kafka-demo", "Simple data one".getBytes())).get(5000, TimeUnit.MILLISECONDS);
    }
}

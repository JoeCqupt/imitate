package io.imitate.producer;

import java.util.concurrent.Future;

public interface Producer extends AutoCloseable {
    Future<RecordMeta> send(ProducerRecord record);
}

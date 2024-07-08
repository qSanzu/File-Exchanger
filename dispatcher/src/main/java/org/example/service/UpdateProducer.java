package org.example.service;

import org.telegram.telegrambots.meta.api.objects.Update;
// передает updat'ы в rabbitmq
public interface UpdateProducer {
    void produce(String rabbitQueue, Update update);
}

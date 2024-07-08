package org.example.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

// принимает ответы из rabbitmq и передает их в updatecontroller
public interface AnswerConsumer {
    void consume(SendMessage sendMessage);
}

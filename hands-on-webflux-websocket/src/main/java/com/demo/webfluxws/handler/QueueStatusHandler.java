package com.demo.webfluxws.handler;

import com.demo.webfluxws.entity.WebSocketSender;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.socket.HandshakeInfo;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class QueueStatusHandler implements WebSocketHandler {

    @Autowired
    public ConcurrentHashMap<String, Set<WebSocketSender>> queueSubscriber;

    @Override
    public Mono<Void> handle(WebSocketSession webSocketSession) {
        HandshakeInfo handshakeInfo = webSocketSession.getHandshakeInfo();
        MultiMap<String> values = new MultiMap<>();
        UrlEncoded.decodeTo(handshakeInfo.getUri().getQuery(), values, "UTF-8");
        String queueId = values.getValue("queueId", 0);
        if (null == queueId) {
            Mono<WebSocketMessage> errorMessage = Mono.just(webSocketSession.textMessage("Missing query parameter 'queueId'."));
            return webSocketSession.send(errorMessage).then();
        }

        return webSocketSession.send(Flux.create(sink -> queueSubscriber.get(queueId).add(new WebSocketSender(webSocketSession, sink))));
    }

}

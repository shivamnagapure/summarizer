package org.demo.summarizer;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class SummarizerService {

    private ChatClient chatClient ;

    public SummarizerService(ChatClient.Builder builder){
        chatClient = builder.build();
    }

    public String summarizer(String ticket){
        String output = chatClient.prompt()
                .user("Summarize the support ticket in 2 lines : \n\n" + ticket)
                .call()
                .content();
        return output ;
    }
}

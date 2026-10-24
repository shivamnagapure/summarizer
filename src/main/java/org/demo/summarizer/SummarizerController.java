package org.demo.summarizer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SummarizerController {

    private  SummarizerService summarizerService ;

    public SummarizerController(SummarizerService summarizerService){
        this.summarizerService = summarizerService ;
    }

    @PostMapping("/summrize")
    public String summarizer(@RequestBody String ticket){
        return summarizerService.summarizer(ticket) ;
    }
}

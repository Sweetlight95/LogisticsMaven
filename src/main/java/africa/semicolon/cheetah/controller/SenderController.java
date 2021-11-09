package africa.semicolon.cheetah.controller;

import africa.semicolon.cheetah.data.models.Sender;
import africa.semicolon.cheetah.dtos.requests.RegisterSenderRequest;
import africa.semicolon.cheetah.dtos.responses.RegisterSenderResponse;
import africa.semicolon.cheetah.services.SenderService;
import africa.semicolon.cheetah.services.SenderServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SenderController {
    private final SenderService senderService = new SenderServiceImpl();

    @PostMapping("/api/v1/sender")
    public RegisterSenderResponse registerSender(@RequestBody RegisterSenderRequest registerSenderRequest){
        return senderService.registerSender(registerSenderRequest);
    }
    @GetMapping("/api/v1/sender/{email}")
    public Optional<Sender> getsender(@PathVariable String email) {
        return senderService.findSenderByEmail(email);
    }
}

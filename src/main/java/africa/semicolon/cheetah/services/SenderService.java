package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.dtos.requests.RegisterSenderRequest;
import africa.semicolon.cheetah.dtos.responses.RegisterSenderResponse;

public interface SenderService {
    RegisterSenderResponse registerSender(RegisterSenderRequest regiisterSenderRequest);
}

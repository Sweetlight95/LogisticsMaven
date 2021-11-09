package africa.semicolon.cheetah.controller;

import africa.semicolon.cheetah.data.models.TrackingInformation;
import africa.semicolon.cheetah.dtos.requests.AddTrackingInfoRequest;
import africa.semicolon.cheetah.dtos.responses.AddTrackingInfoResponse;
import africa.semicolon.cheetah.services.TrackingService;
import africa.semicolon.cheetah.services.TrackingServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class PackageTrackingController {
    private final TrackingService trackingService = new TrackingServiceImpl();

    @PostMapping("/api/trackingInfo")
    public AddTrackingInfoResponse addTrackingInfo(@RequestBody AddTrackingInfoRequest addTrackingInfoRequest){
    return trackingService.updateTrackingInfo(addTrackingInfoRequest);}

    @GetMapping("/api/trackingInfo/{id}")
    public TrackingInformation getTrackingInfo (@PathVariable("id") Integer trackingId) {
        return trackingService.trackPackage(trackingId);
    }

}

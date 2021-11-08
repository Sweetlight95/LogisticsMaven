package africa.semicolon.cheetah.utils;
import africa.semicolon.cheetah.data.models.Package;
import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;

public class ModelMapper {
    public static Package map(AddPackageRequest addPackageRequest){
        Package aPackage = new Package();
        aPackage.setName(addPackageRequest.getPackageDescription());
        aPackage.setDeliveryAddress(addPackageRequest.getDeliveryAddress());
        aPackage.setSenderEmail(addPackageRequest.getSenderEmail());
        aPackage.setReceiverPhone(addPackageRequest.getReceiverPhone());
        aPackage.setReceiverName(addPackageRequest.getReceiverName());
        aPackage.setNetWeight(addPackageRequest.getPackageWeight());
        return  aPackage;

    }
    public static AddPackageResponse map(Package savedPackage){
        AddPackageResponse response = new AddPackageResponse();
        response.setPackageName(savedPackage.getName());
        response.setPackageWeight(savedPackage.getNetWeight());
        response.setReceiverName(savedPackage.getReceiverName());
        response.setTrackingNumber(savedPackage.getId());
        response.setReceiverPhone(savedPackage.getReceiverPhone());
//        return converted response;
        return response;
    }
}


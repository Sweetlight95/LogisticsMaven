package africa.semicolon.cheetah.controller;

import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.services.PackageService;
import africa.semicolon.cheetah.services.PackageServiceImpl;

public class PackageController {
    private PackageService packageService = new PackageServiceImpl();
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
        return packageService.addPackage(addPackageRequest);
    }

}

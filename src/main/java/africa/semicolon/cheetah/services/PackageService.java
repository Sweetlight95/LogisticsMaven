package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;

public interface PackageService {
    AddPackageResponse addPackage(AddPackageRequest addPackageRequest);
}

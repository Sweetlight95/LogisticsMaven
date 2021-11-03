package africa.semicolon.cheetah.controller;

import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.services.PackageService;
import africa.semicolon.cheetah.services.PackageServiceImpl;
import africa.semicolon.cheetah.data.models.Package;
import org.springframework.web.bind.annotation.*;


@RestController
public class PackageController {
    private PackageService packageService = new PackageServiceImpl();
    @PostMapping("/api/addpackage")
    public AddPackageResponse addPackage(@RequestBody AddPackageRequest addPackageRequest) {
        return packageService.addPackage(addPackageRequest);
    }
    @GetMapping("/api/package/{id}")
    public Package findPackageById(@PathVariable("id") Integer id) {
        return packageService.findMyPackageWithMy(id);
    }
}

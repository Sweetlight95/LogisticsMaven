package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.data.models.Package;
import africa.semicolon.cheetah.data.repositories.PackageRepository;
import africa.semicolon.cheetah.data.repositories.PackageRepositoryImpl;
import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.utils.ModelMapper;

public class PackageServiceImpl implements PackageService{
    private final PackageRepository packageRepository = new PackageRepositoryImpl();

    @Override
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
        //    convert addpackage request to a package
      Package aPackage = ModelMapper.map(addPackageRequest);

//        save package
        Package savedPackage = packageRepository.save(aPackage);

//        convert saved package to addpackage response
//        AddPackageResponse response = ModelMapper.map(savedPackage);
//        return response;
//        or
        return ModelMapper.map(savedPackage);
    }

    @Override
    public Package findMyPackageWithMy(Integer id){
        return packageRepository.findById(id);
    }
}

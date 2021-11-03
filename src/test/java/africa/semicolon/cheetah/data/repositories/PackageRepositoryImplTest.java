package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {
    private PackageRepository packageRepository;

    @BeforeEach
    void setUp() {
        packageRepository = new PackageRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveNewPackageTest() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderName("Jerry");
        aPackage.setReceiverName("Dami");
        aPackage.setReceiverPhone("09876444");
        aPackage.setNetWeight(23.5);
        aPackage.setDeliveryAddress("312 Herbert Macauley Way, Sabo Yaba Lagos");
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savePackage = packageRepository.save(aPackage);
        assertEquals(1, savePackage.getTrackingNumber());
    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteByTrackingNumber() {
    }

    @Test
    void findPackageTrackingNumber() {
    }
}
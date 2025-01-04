package io.github.robsonfe.crud_hexagonal.application.ports.out;

import io.github.robsonfe.crud_hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}

package io.github.robsonfe.crud_hexagonal.adapters.out.client.mapper;

import io.github.robsonfe.crud_hexagonal.adapters.out.client.response.AddressResponse;
import io.github.robsonfe.crud_hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}

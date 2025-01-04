package io.github.robsonfe.crud_hexagonal.adapters.in.controller.mapper;

import io.github.robsonfe.crud_hexagonal.adapters.in.controller.request.CustomerRequest;
import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest request);

    Customer toConsumeResponse(Customer customer);

}

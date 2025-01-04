package io.github.robsonfe.crud_hexagonal.adapters.out.repository.mapper;

import io.github.robsonfe.crud_hexagonal.adapters.out.repository.entity.CustomerEntity;
import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}

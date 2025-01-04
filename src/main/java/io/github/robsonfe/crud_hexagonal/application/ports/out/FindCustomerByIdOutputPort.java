package io.github.robsonfe.crud_hexagonal.application.ports.out;

import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> findById(String id);

}

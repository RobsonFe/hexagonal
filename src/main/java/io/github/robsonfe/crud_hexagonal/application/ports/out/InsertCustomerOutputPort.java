package io.github.robsonfe.crud_hexagonal.application.ports.out;

import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}

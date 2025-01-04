package io.github.robsonfe.crud_hexagonal.application.ports.in;

import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer findById(String id);
}

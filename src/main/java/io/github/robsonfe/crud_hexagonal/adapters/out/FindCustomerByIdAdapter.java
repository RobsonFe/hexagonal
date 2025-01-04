package io.github.robsonfe.crud_hexagonal.adapters.out;

import io.github.robsonfe.crud_hexagonal.adapters.out.repository.CustomerRepository;
import io.github.robsonfe.crud_hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;
import io.github.robsonfe.crud_hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> findById(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}

package io.github.robsonfe.crud_hexagonal.adapters.out;

import io.github.robsonfe.crud_hexagonal.adapters.out.repository.CustomerRepository;
import io.github.robsonfe.crud_hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;
import io.github.robsonfe.crud_hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}

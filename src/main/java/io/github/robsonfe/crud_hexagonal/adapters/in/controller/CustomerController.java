package io.github.robsonfe.crud_hexagonal.adapters.in.controller;

import io.github.robsonfe.crud_hexagonal.adapters.in.controller.mapper.CustomerMapper;
import io.github.robsonfe.crud_hexagonal.adapters.in.controller.request.CustomerRequest;
import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;
import io.github.robsonfe.crud_hexagonal.application.ports.in.FindCustomerByIdInputPort;
import io.github.robsonfe.crud_hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        var customer = customerMapper.toCustomer(request);
        insertCustomerInputPort.insert(customer, request.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable String id) {
        var customer = findCustomerByIdInputPort.findById(id);

        var customerResponse = customerMapper.toConsumeResponse(customer);
        return ResponseEntity.ok(customerResponse);
    }
}

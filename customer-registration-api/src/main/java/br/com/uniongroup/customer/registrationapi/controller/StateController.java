 package br.com.uniongroup.customer.registrationapi.controller;

import br.com.uniongroup.customer.registrationapi.model.State;
import br.com.uniongroup.customer.registrationapi.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/states") // value é opcional!
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public List<State> findAll() {
        return stateRepository.findAll();
    }
}



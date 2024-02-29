package br.com.uniongroup.customer.registrationapi.repository;

import br.com.uniongroup.customer.registrationapi.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}

package com.verizon.csp.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.verizon.csp.model.Orderingmodel;
@Repository
public interface Orderingrepo extends JpaRepository<Orderingmodel,Integer> {

}

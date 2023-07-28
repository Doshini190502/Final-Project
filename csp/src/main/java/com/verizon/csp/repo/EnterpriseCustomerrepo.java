package com.verizon.csp.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.verizon.csp.model.EnterpriseCustmodel;
@Repository
public interface EnterpriseCustomerrepo extends JpaRepository<EnterpriseCustmodel,Integer> {

}

/**
 * 
 */
package uvsoftgroup.springcassandrarestfulws.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import uvsoftgroup.springcassandrarestfulws.model.UserRegistration;
import uvsoftgroup.springcassandrarestfulws.utility.ResultTO;

public interface UserRegistrationService {
	   UserRegistration save(UserRegistration userRegistration);
	   UserRegistration saveFromCR(UserRegistration userRegistration);
	   
	    UserRegistration delete(Long id);
	    ResultTO deleteFromCR(Long id);
	    
	    UserRegistration findOne(Long id);
	    
	    UserRegistration update(UserRegistration userRegistration);
	    UserRegistration updateFromCR(UserRegistration userRegistration, Long id);

	    List<UserRegistration> findAll();
	    List<UserRegistration> findAllFromCR();

	    Page<UserRegistration> findByUserRegistrationName(String userRegistrationName, PageRequest pageRequest);
	    List<UserRegistration> findByUserRegistrationfullName(String userRegistrationfullName);
}

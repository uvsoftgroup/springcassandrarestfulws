/**
 * 
 */
package uvsoftgroup.springcassandrarestfulws.repositories;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springcassandrarestfulws.model.UserRegistration;


@RepositoryRestResource(collectionResourceRel = "userRegistrationCRUDR", path = "userRegistrationsCRUDR")
public interface UserRegistrationCrudRepository extends CrudRepository<UserRegistration, Long> {
	
	@Query(" SELECT * FROM userregistration WHERE userRegistrationName=?0 ALLOW FILTERING")
	UserRegistration findByUserRegistrationNameQuery(String userRegistrationName);
	UserRegistration findUserRegistrationByUserRegistrationName(String userRegistrationName);

}

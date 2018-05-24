/**
 * 
 */
package uvsoftgroup.springcassandrarestfulws.repositories;

import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springcassandrarestfulws.model.UserRegistration;


@RepositoryRestResource(collectionResourceRel = "userRegistration", path = "userRegistrations")
public interface UserRegistrationTypedIdCassandraRepository extends TypedIdCassandraRepository<UserRegistration, Long> {
	
	

}

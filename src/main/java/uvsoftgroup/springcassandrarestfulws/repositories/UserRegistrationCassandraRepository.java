/**
 * 
 */
package uvsoftgroup.springcassandrarestfulws.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import uvsoftgroup.springcassandrarestfulws.model.UserRegistration;

@Repository
public interface UserRegistrationCassandraRepository extends CassandraRepository<UserRegistration> {
	
	List<UserRegistration> findByUserRegistrationName(@Param("userRegistrationName") String userRegistrationName);
	@Query(" SELECT * FROM userregistration WHERE userregistrationname=?0 ALLOW FILTERING")
	List<UserRegistration> findByUserRegistrationNameQuery(String userRegistrationName);
	
}

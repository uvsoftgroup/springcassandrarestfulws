/**
 * 
 */
package uvsoftgroup.springcassandrarestfulws.repositories;

import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.springcassandrarestfulws.model.AddressLocationInfo;


@RepositoryRestResource(collectionResourceRel="addressLocationInfo",path="addressLocationInfos")
public interface AddressLocationInfoRepository extends TypedIdCassandraRepository<AddressLocationInfo, Long> {

}

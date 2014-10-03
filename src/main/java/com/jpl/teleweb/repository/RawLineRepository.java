package com.jpl.teleweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jpl.teleweb.domain.RawLine;

/**
 * Spring Data MongoDB repository for the RawLine entity.
 */
public interface RawLineRepository extends MongoRepository<RawLine, String> {


	// @Query("{activationKey: ?0}")
	// User getUserByActivationKey(String activationKey);
	//
	//
	// @Query("{activation_key: 'false', createdDate: {$gt: ?0}")
	// List<User> findNotActivatedUsersByCreationDateBefore(LocalDate localDate);

}

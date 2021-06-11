package com.codeforgeyt.jpainheritjoinedtable.repository;

import com.codeforgeyt.jpainheritjoinedtable.model.Infantry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends CrudRepository<Infantry, Long> {
}

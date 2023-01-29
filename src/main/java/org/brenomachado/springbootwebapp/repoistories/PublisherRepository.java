package org.brenomachado.springbootwebapp.repoistories;

import org.brenomachado.springbootwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

package org.brenomachado.springbootwebapp.repoistories;

import org.brenomachado.springbootwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

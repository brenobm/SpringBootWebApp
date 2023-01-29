package org.brenomachado.springbootwebapp.repoistories;

import org.brenomachado.springbootwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

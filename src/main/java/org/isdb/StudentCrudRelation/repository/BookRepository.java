package org.isdb.StudentCrudRelation.repository;

import org.isdb.StudentCrudRelation.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>{

}

package com.shraddha.bookwebapp.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.shraddha.bookwebapp.model.Books;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}

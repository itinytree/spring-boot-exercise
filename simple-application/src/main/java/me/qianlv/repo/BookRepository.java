package me.qianlv.repo;

import me.qianlv.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author xiaoshu
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}

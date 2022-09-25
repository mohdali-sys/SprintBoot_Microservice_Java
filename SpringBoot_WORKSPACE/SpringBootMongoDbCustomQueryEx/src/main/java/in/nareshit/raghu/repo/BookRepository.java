package in.nareshit.raghu.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import in.nareshit.raghu.collection.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

	//fetch one by ID
	@Query("{ id: ?0 }") // WHERE id=?
	Optional<Book> getOneBook(Integer id);
	
	@Query(" { writer:?0, category : ?1 } ")
	//@Query("{ $and : [ { writer:?0} , {category : ?1 } ] }")
	List<Book> getBookByWriterAndCategory(String writer, String category);
	
	@Query("{ noOfPages : { $gt : ?0 } }")
	List<Book> getBooksGtNpgs(Integer pages);
	
	@Query("{ $or : [ { writer:?0} , {category : ?1 } ] }")
	List<Book> getBookByWriterOrCategory(String writer, String category);
	
	
	//----------------------------------------------------
	//select id, title, nps,writer from book where id=?
	@Query(value = "{ id: ?0 }", fields = "{ title:1, noOfPages:1, writer:1}")
	List<Book> getBookA(Integer id);
	
	//SELECT COUNT(*) ....
	@Query(value="{ writer: ?0}",count = true)
	Integer countDataB(String writer);
	
	@Query(value="{ writer: ?0}",exists = true)
	Boolean isBookExistByWriter(String writer);
	
	//@Query(value="{ writer: ?0}",sort = "{ title : 1} ") //1 ASC, -1 DESC
	@Query(value="{ writer: ?0}",sort = "{ title : -1} ") //1 ASC, -1 DESC
	List<Book> getDataSort(String writer);
	
	//delete from book where category=?
	@Query(value="{ category:?0 }",delete = true)
	Long deleteByCategory(String category);
}

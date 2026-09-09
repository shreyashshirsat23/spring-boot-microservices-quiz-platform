package com.company.question_service.Repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.company.question_service.model.Question;
import org.springframework.data.repository.query.Param;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    public List<Question> findByCategory(String category);
    
    public List<Question> findByQuestionTitle(String questionTitle);
    

//    // Native query to find random questions by category
//    @Query(value = "SELECT * FROM question WHERE category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
//    public List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);
    
    

    @Query(value = """
            SELECT q.id
            FROM question q
            WHERE q.category = :category
            ORDER BY RAND()
            LIMIT :numQ
            """, nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(
            @Param("category") String category,
            @Param("numQ") int numQ
    );

}

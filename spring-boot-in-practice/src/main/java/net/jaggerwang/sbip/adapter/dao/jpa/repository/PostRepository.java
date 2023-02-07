package net.jaggerwang.sbip.adapter.dao.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import net.jaggerwang.sbip.adapter.dao.jpa.entity.Post;

/**
 * @author Jagger Wang
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long>, QuerydslPredicateExecutor<Post> {
}

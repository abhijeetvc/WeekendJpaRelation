package com.weekendjparelation.WeekendJpaRelation.repository;

import com.weekendjparelation.WeekendJpaRelation.domain.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by abhi on 07/01/18.
 */
public interface BookCategoryRepo extends JpaRepository<BookCategory,Integer> {
}

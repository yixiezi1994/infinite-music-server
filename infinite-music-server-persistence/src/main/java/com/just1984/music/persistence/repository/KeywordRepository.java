package com.just1984.music.persistence.repository;

import com.just1984.music.persistence.entity.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordRepository extends JpaRepository<Keyword, Long> {
}

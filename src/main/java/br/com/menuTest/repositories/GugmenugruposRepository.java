package br.com.menuTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.menuTest.domain.Gugmenugrupos;

@Repository
public interface GugmenugruposRepository extends JpaRepository<Gugmenugrupos, Integer> {

}

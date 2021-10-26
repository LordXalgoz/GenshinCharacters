package com.example.genshincharacter.models.tables;

import com.example.genshincharacter.models.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TableCharacters extends JpaRepository<Character, Integer>{
    @Query(value = "select * from characters where name like 'С%'", nativeQuery = true)
    List<Character> findWhereNameStartsFromC();
}
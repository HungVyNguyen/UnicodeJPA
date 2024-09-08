package com.example.unicodejpa.unicodeRepository;

import com.example.unicodejpa.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnicodeRepository extends JpaRepository<Unicode,Character> {



}

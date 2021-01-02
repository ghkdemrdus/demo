package com.example.demo.repository;

import com.example.demo.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //저장소에 저장
    Optional<Member> findById(Long id); //null처리
    Optional<Member> findByName(String name);
    List<Member> findAll(); //모든 리스트 반환
}

package com.keyin.golfclubmembership.repository;

import com.keyin.golfclubmembership.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByNameContaining(String name);

    List<Member> findByPhoneNumber(String phoneNumber);

    List<Member> findByStartDateBetween(LocalDate start, LocalDate end);
}



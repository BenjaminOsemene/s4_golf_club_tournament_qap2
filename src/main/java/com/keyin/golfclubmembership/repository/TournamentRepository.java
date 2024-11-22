//package com.keyin.golfclubmembership.repository;
//
//import com.keyin.golfclubmembership.model.Tournament;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Repository
//public interface TournamentRepository extends JpaRepository<Tournament, Long> {
//    List<Tournament> findByStartDateBetween(LocalDate start, LocalDate end);
//    List<Tournament> findByLocation(String location);
//}


package com.keyin.golfclubmembership.repository;

import com.keyin.golfclubmembership.model.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {

    List<Tournament> findByStartDateBetween(LocalDate start, LocalDate end);

    List<Tournament> findByLocation(String location);
}


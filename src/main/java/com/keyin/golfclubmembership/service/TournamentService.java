//package com.keyin.golfclubmembership.service;
//
//import com.keyin.golfclubmembership.model.Member;
//import com.keyin.golfclubmembership.model.Tournament;
//import com.keyin.golfclubmembership.repository.MemberRepository;
//import com.keyin.golfclubmembership.repository.TournamentRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class TournamentService {
//    private final TournamentRepository tournamentRepository;
//    private final MemberRepository memberRepository;
//
//    public Tournament addTournament(Tournament tournament) {
//        return tournamentRepository.save(tournament);
//    }
//
//    public List<Tournament> getAllTournaments() {
//        return tournamentRepository.findAll();
//    }
//
//    public Tournament addMemberToTournament(Long tournamentId, Long memberId) {
//        Tournament tournament = tournamentRepository.findById(tournamentId)
//                .orElseThrow(() -> new RuntimeException("Tournament not found"));
//        Member member = memberRepository.findById(memberId)
//                .orElseThrow(() -> new RuntimeException("Member not found"));
//        tournament.getParticipants().add(member);
//        return tournamentRepository.save(tournament);
//    }
//
//    public List<Tournament> searchTournaments(LocalDate startDate, String location) {
//        if (startDate != null) {
//            return tournamentRepository.findByStartDateBetween(startDate, startDate.plusDays(1));
//        } else if (location != null) {
//            return tournamentRepository.findByLocation(location);
//        }
//        return new ArrayList<>();
//    }
//
//    public List<Member> getTournamentMembers(Long tournamentId) {
//        Tournament tournament = tournamentRepository.findById(tournamentId)
//                .orElseThrow(() -> new RuntimeException("Tournament not found"));
//        return new ArrayList<>(tournament.getParticipants());
//    }
//}


package com.keyin.golfclubmembership.service;

import com.keyin.golfclubmembership.model.Member;
import com.keyin.golfclubmembership.model.Tournament;
import com.keyin.golfclubmembership.repository.MemberRepository;
import com.keyin.golfclubmembership.repository.TournamentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TournamentService {

    private final TournamentRepository tournamentRepository;
    private final MemberRepository memberRepository;

    public Tournament addTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public Tournament addMemberToTournament(Long tournamentId, Long memberId) {
        Tournament tournament = tournamentRepository.findById(tournamentId)
                .orElseThrow(() -> new RuntimeException("Tournament not found"));
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new RuntimeException("Member not found"));
        tournament.getParticipants().add(member); // Add member to participants list
        return tournamentRepository.save(tournament); // Save updated tournament
    }

    public List<Tournament> searchTournaments(LocalDate startDate, String location) {
        if (startDate != null) {
            return tournamentRepository.findByStartDateBetween(startDate, startDate.plusDays(1));
        } else if (location != null) {
            return tournamentRepository.findByLocation(location);
        }
        return new ArrayList<>(); // Return empty list if no criteria provided
    }

    public List<Member> getTournamentMembers(Long tournamentId) {
        Tournament tournament = tournamentRepository.findById(tournamentId)
                .orElseThrow(() -> new RuntimeException("Tournament not found"));
        return new ArrayList<>(tournament.getParticipants());
    }
}

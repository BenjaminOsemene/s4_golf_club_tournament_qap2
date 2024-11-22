//package com.keyin.golfclubmembership.controller;
//
//import com.keyin.golfclubmembership.model.Member;
//import com.keyin.golfclubmembership.model.Tournament;
//import com.keyin.golfclubmembership.service.TournamentService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/tournaments")
//@RequiredArgsConstructor
//public class TournamentController {
//    private final TournamentService tournamentService;
//
//    @PostMapping
//    public ResponseEntity<Tournament> addTournament(@RequestBody Tournament tournament) {
//        return ResponseEntity.ok(tournamentService.addTournament(tournament));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Tournament>> getAllTournaments() {
//        return ResponseEntity.ok(tournamentService.getAllTournaments());
//    }
//
//    @PostMapping("/{tournamentId}/members/{memberId}")
//    public ResponseEntity<Tournament> addMemberToTournament(@PathVariable Long tournamentId, @PathVariable Long memberId) {
//        return ResponseEntity.ok(tournamentService.addMemberToTournament(tournamentId, memberId));
//    }
//
//    @GetMapping("/search")
//    public ResponseEntity<List<Tournament>> searchTournaments(
//            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
//            @RequestParam(required = false) String location) {
//        return ResponseEntity.ok(tournamentService.searchTournaments(startDate, location));
//    }
//
//    @GetMapping("/{tournamentId}/members")
//    public ResponseEntity<List<Member>> getTournamentMembers(@PathVariable Long tournamentId) {
//        return ResponseEntity.ok(tournamentService.getTournamentMembers(tournamentId));
//    }


package com.keyin.golfclubmembership.controller;

import com.keyin.golfclubmembership.model.Member;
import com.keyin.golfclubmembership.model.Tournament;
import com.keyin.golfclubmembership.service.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/tournaments") // Base path for all tournament-related endpoints
@RequiredArgsConstructor
public class TournamentController {

    private final TournamentService tournamentService;

    @PostMapping
    public ResponseEntity<Tournament> addTournament(@RequestBody Tournament tournament) {
        return ResponseEntity.ok(tournamentService.addTournament(tournament));
    }

    @GetMapping
    public ResponseEntity<List<Tournament>> getAllTournaments() {
        return ResponseEntity.ok(tournamentService.getAllTournaments());
    }

    @PostMapping("/{tournamentId}/members/{memberId}")
    public ResponseEntity<Tournament> addMemberToTournament(@PathVariable Long tournamentId, @PathVariable Long memberId) {
        return ResponseEntity.ok(tournamentService.addMemberToTournament(tournamentId, memberId));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Tournament>> searchTournaments(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam(required = false) String location) {
        return ResponseEntity.ok(tournamentService.searchTournaments(startDate, location));
    }


    @GetMapping("/{tournamentId}/members")
    public ResponseEntity<List<Member>> getTournamentMembers(@PathVariable Long tournamentId) {
        return ResponseEntity.ok(tournamentService.getTournamentMembers(tournamentId));
    }
}

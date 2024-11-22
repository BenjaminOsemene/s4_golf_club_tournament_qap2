//package com.keyin.golfclubmembership.controller;
//
//import com.keyin.golfclubmembership.model.Member;
//import com.keyin.golfclubmembership.service.MemberService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/members")
//@RequiredArgsConstructor
//public class MemberController {
//    private final MemberService memberService;
//
//    @PostMapping
//    public ResponseEntity<Member> addMember(@RequestBody Member member) {
//        return ResponseEntity.ok(memberService.addMember(member));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Member>> getAllMembers() {
//        return ResponseEntity.ok(memberService.getAllMembers());
//    }
//
//    @GetMapping("/search")
//    public ResponseEntity<List<Member>> searchMembers(
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String phoneNumber,
//            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate) {
//        return ResponseEntity.ok(memberService.searchMembers(name, phoneNumber, startDate));
//    }
//}
package com.keyin.golfclubmembership.controller;

import com.keyin.golfclubmembership.model.Member;
import com.keyin.golfclubmembership.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        return ResponseEntity.ok(memberService.addMember(member));
    }

    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers() {
        return ResponseEntity.ok(memberService.getAllMembers());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Member>> searchMembers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String phoneNumber,
            @RequestParam(required = false) Integer membershipDuration,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate) {
        return ResponseEntity.ok(memberService.searchMembers(name, phoneNumber, membershipDuration, startDate));
    }
}















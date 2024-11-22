//package com.keyin.golfclubmembership.service;
//
//import com.keyin.golfclubmembership.model.Member;
//import com.keyin.golfclubmembership.repository.MemberRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class MemberService {
//    private final MemberRepository memberRepository;
//
//    public Member addMember(Member member) {
//        return memberRepository.save(member);
//    }
//
//    public List<Member> getAllMembers() {
//        return memberRepository.findAll();
//    }
//
//    public List<Member> searchMembers(String name, String phoneNumber, LocalDate startDate) {
//        if (name != null) {
//            return memberRepository.findByNameContaining(name);
//        } else if (phoneNumber != null) {
//            return memberRepository.findByPhoneNumber(phoneNumber);
//        } else if (startDate != null) {
//            return memberRepository.findByStartDateBetween(startDate, startDate.plusDays(1));
//        }
//        return new ArrayList<>();
//    }
//}
package com.keyin.golfclubmembership.service;

import com.keyin.golfclubmembership.model.Member;
import com.keyin.golfclubmembership.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public List<Member> searchMembers(String name, String phoneNumber, Integer membershipDuration, LocalDate startDate) {
        List<Member> members = memberRepository.findAll();

        return members.stream()
                .filter(member -> name == null || member.getName().contains(name))
                .filter(member -> phoneNumber == null || member.getPhoneNumber().equals(phoneNumber))
                .filter(member -> membershipDuration == null || member.getMembershipDuration().equals(membershipDuration))
                .filter(member -> startDate == null || member.getStartDate().equals(startDate))
                .collect(Collectors.toList());
    }
}




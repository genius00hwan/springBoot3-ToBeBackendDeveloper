package com.example.umcStudyBook.Service;

import com.example.umcStudyBook.Domain.Member;
import com.example.umcStudyBook.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository;


    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}

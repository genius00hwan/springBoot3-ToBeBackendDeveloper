package com.example.umcStudyBook.Repository;

import com.example.umcStudyBook.Domain.Member;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    default List<Member> findAll() {
        List<Member> memberList = new ArrayList<>();
        return memberList;
    }
}

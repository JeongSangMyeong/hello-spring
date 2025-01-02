package hello.hellospring.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import hello.hellospring.domain.Member;

public interface MemberRepository {
    Member save(Member member) throws SQLException;

    Optional<Member> findById(Long id);

    Optional<Member> findByName(String name);

    List<Member> findAll();
}

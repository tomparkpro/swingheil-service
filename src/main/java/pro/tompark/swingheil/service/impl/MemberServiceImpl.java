package pro.tompark.swingheil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pro.tompark.swingheil.model.Member;
import pro.tompark.swingheil.repository.MemberRepository;
import pro.tompark.swingheil.service.MemberService;

import java.util.List;
import java.util.Optional;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Optional<Member> getMember(Long memberSn) {
        return memberRepository.findById(memberSn);
    }

    @Override
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }


}

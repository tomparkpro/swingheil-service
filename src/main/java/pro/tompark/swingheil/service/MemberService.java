package pro.tompark.swingheil.service;


import pro.tompark.swingheil.model.Member;

import java.util.List;
import java.util.Optional;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
public interface MemberService {

    Member createMember(Member member);

    Optional<Member> getMember(Long memberSn);

    List<Member> getMembers();
}

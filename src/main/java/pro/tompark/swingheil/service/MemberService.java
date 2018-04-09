package pro.tompark.swingheil.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pro.tompark.swingheil.model.Member;

import java.util.List;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
public interface MemberService {

    Member createMember(Member member);

    Member getMember(Long memberSn);

    List<Member> getMembers();
}

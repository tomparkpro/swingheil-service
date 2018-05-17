package pro.tompark.swingheil.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import pro.tompark.swingheil.config.SwingheilTestConfig;
import pro.tompark.swingheil.model.Member;
import pro.tompark.swingheil.repository.MemberRepository;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    public void testCreateMember() {
        Member member = new Member();
        member.setNickname("Tom");
        Member saved = memberService.createMember(member);

        Member selected = memberService.getMember(saved.getMemberSn());

        System.err.println(selected.getNickname());
    }
}

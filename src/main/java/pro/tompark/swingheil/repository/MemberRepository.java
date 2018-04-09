package pro.tompark.swingheil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.tompark.swingheil.model.Member;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}

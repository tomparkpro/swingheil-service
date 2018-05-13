package pro.tompark.swingheil.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@Getter
@Setter
@ToString
@Entity
@Table(name="member")
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_sn", nullable = false)
    private Long memberSn;

    @Column(name = "nickname")
    private String nickname;
}

package pro.tompark.swingheil.member.model;

public class Member {

    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Member{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}

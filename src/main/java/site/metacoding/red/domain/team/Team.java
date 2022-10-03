package site.metacoding.red.domain.team;



import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Team {
	private Integer id;
	private String name;
	private Integer stadiumId;
	private Timestamp createdAt;
	
	// 엔티티가 아닌 필드 -> 받을 때 필요
	private Integer no; //db에 없는 값을 엔티티에 직접 만들기도 한다
	private String stadiumName; //요청받을 때만 만들고, 응답받을 때는 안 만들어도 됨
}

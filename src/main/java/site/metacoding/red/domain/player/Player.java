package site.metacoding.red.domain.player;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	private Integer id;
	private String name;
	private String position;
	private Integer teamId;
	private boolean isOuter;
	private Timestamp createdAt;
	
	// 엔티티가 아닌 필드 (Transient - 메모리에서만 노는 애들)
	private Integer no; //db에 없는 값을 엔티티에 직접 만들기도 한다
	private String teamName;
}

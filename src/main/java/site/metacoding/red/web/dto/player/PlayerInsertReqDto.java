package site.metacoding.red.web.dto.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.player.Player;

@Setter
@Getter
public class PlayerInsertReqDto {	// 통신으로는 얘를 받음
	private String name;
	private String position;
	private Integer teamId;
	
	public Player toEntity() { // 나중에 엔티티에서는 toDto 만들어 주면 좋다(응답할 때) / DB에 넘길 때는 toEntity로 넘김
		Player player = new Player();
		player.setName(this.name);
		player.setPosition(this.position);
		player.setTeamId(this.teamId);
		return player;
	}
}

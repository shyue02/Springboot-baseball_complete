package site.metacoding.red.web.dto.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.team.Team;

@Setter
@Getter
public class TeamInsertReqDto {	//엔티티이름 + 행위 + 받을지 응답할지 + Dto
	private String name;
	private Integer stadiumId;
	
	public Team toEntity() { // 나중에 엔티티에서는 toDto 만들어 주면 좋다(응답할 때)
		Team team = new Team();
		team.setName(this.name);
		team.setStadiumId(this.stadiumId);
		return team;
	}
}

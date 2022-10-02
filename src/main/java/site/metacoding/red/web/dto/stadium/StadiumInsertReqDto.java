package site.metacoding.red.web.dto.stadium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;

@Setter
@Getter
public class StadiumInsertReqDto {	//엔티티이름 + 행위 + 받을지 응답할지 + Dto
	private String name;
	
	public Stadium toEntity() { // 나중에 엔티티에서는 toDto 만들어 주면 좋다(응답할 때)
		Stadium stadium = new Stadium();
		stadium.setName(this.name);
		return stadium;
	}
}

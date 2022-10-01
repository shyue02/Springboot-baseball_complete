package site.metacoding.red.domain.team;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Team {
	private Integer id;
	private String name;
	private Integer staduimId;
	private Timestamp createdAt;
}

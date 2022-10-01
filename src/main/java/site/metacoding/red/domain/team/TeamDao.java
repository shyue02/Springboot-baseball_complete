package site.metacoding.red.domain.team;

import java.util.List;

public interface TeamDao {
	public List<Team> findAll(); 	// 찾아서 줘야하니까 리턴값이 필요하다 -> List<>
	public Team findById(Integer id);	// Id로 받음
	public void insert(Team team); //stadium으로 받음
	public void update(Integer id, Team team);	// update는 보통 두 개 받는다
	public void deleteById(Integer id); // Id로 삭제할꺼니까 ById
}

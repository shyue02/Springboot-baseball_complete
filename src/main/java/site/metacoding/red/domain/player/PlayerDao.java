package site.metacoding.red.domain.player;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PlayerDao {
	public List<Player> findAll(); 	// 찾아서 줘야하니까 리턴값이 필요하다 -> List<>
	public Player findById(Integer id);	// Id로 받음
	public void insert(Player player); //stadium으로 받음
	public void update(Integer id, Player player);	// update는 보통 두 개 받는다
	public void deleteById(Integer id); // Id로 삭제할꺼니까 ById
	
	// 테스트
	public List<String> findTeam();
	public List<Map<String, Object>> findPositionByTeam(@Param("teamNameList") List<String> teamNameList);
}

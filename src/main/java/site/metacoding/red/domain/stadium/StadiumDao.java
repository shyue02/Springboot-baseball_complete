package site.metacoding.red.domain.stadium;

import java.util.List;

public interface StadiumDao {
	public List<Stadium> findAll(); 	// 찾아서 줘야하니까 리턴값이 필요하다 -> List<>
	public Stadium findById(Integer id);	// Id로 받음
	public void insert(Stadium stadium); //stadium으로 받음
	public void update(Integer id, Stadium stadium);	// update는 보통 두 개 받는다
	public void deleteById(Integer id); // Id로 삭제할꺼니까 ById
}

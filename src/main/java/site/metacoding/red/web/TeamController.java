package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.team.TeamInsertReqDto;

@RequiredArgsConstructor
@Controller
public class TeamController {

	private final TeamService teamService;
	private final StadiumService stadiumService;

	@GetMapping("/team")
	public String list(Model model) {
		List<Team> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "team/list";
	}
	
	@GetMapping("/teamForm")
	public String teamForm(Model model) {
		List<Stadium> stadiumList = stadiumService.목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "team/saveForm";
	}
	
	@PostMapping("/team")	//saveForm의 ajax를 받음 / dto로 받아야 하니까 dto 생성
	public @ResponseBody CMRespDto<?> insert(@RequestBody TeamInsertReqDto teamInsertReqDto){
		teamService.팀등록(teamInsertReqDto); // Dto에 있는 값을 이용해서 무언갈 해야 할 수도 있으니까 서비스로 그대로 넘기자, 여기서 엔티로 바꿀 필요x, 
		return new CMRespDto<>(1, "팀등록성공", null);
	}
}
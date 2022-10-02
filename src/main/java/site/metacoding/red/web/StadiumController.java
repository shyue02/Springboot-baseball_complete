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
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.stadium.StadiumInsertReqDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;

	@GetMapping("/stadium")
	public String list(Model model) {
		List<Stadium> stadiumList = stadiumService.목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "stadium/list";
	}
	
	@GetMapping("/stadiumForm")
	public String stadiumForm() {
		return "stadium/saveForm";
	}
	
	@PostMapping("/stadium")
	public @ResponseBody CMRespDto<?> insert(@RequestBody StadiumInsertReqDto stadiumInsertReqDto){	// json으로 통일 -> json으로 받을거니까 dto가 한 건이라도 만들어져 있어야 한다
		stadiumService.경기장등록(stadiumInsertReqDto);
		return new CMRespDto<>(1, "경기장등록성공", null);
	}
}

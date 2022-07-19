package data;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.hyun.AppTest;
import me.hyun.mapper.BoardMapper;
import me.hyun.model.BoardVO;

public class DataInsertTest extends AppTest{
	
	@Autowired
	BoardMapper mapper;
	
	@Test
	public void dataInsert() {
		for (int i = 1; i <= 412; i++) {
			BoardVO vo = new BoardVO();
			vo.setTitle("제목 : 페이징 처리 연습" + i);
			vo.setContent("내용 : 페이징 처리 연습" + i);
			vo.setWriter("관리자");
			mapper.insert(vo);
		}
	}
}

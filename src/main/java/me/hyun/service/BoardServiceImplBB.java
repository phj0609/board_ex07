package me.hyun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import me.hyun.mapper.BoardMapper;
import me.hyun.model.BoardVO;

@Service
@Primary
public class BoardServiceImplBB implements BoardService {

	public BoardServiceImplBB() {
		System.out.println("두번째 구현체");
	}
	
	private BoardMapper mapper;

	@Autowired
	public void setMapper(BoardMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<BoardVO> readAll() {
		System.out.println("구현BB사용");
		return mapper.getList();
	}

	@Override
	public BoardVO read(Long bno) {
		return mapper.get(bno);
	}

	@Override
	public void register(BoardVO vo) {
		mapper.insert(vo);
		
	}

	@Override
	public void modify(BoardVO vo) {
		mapper.update(vo);
	}

	@Override
	public void remove(Long bno) {
		mapper.delete(bno);
	}

}

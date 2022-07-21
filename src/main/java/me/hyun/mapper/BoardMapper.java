package me.hyun.mapper;

import java.util.List;

import me.hyun.model.BoardVO;
import me.hyun.model.Criteria;

public interface BoardMapper {
	List<BoardVO> getList(Criteria criteria);
	BoardVO get(Long bno);
	void insert(BoardVO vo);
	void update(BoardVO vo);
	void delete(Long bno);
	Integer totalCount(Criteria criteria);
}

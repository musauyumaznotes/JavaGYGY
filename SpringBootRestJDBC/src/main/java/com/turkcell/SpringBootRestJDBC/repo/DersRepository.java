package com.turkcell.SpringBootRestJDBC.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turkcell.SpringBootRestJDBC.model.Ders;
import com.turkcell.SpringBootRestJDBC.model.DersDTO;
import com.turkcell.SpringBootRestJDBC.model.Konu;
import com.turkcell.SpringBootRestJDBC.model.Ogretmen;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class DersRepository
{
	private JdbcTemplate jdbcTemplate;

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public List<Ders> getAll()
	{
		List<Ders> liste;
		String sql = "SELECT * FROM \"obsh\".\"ders\"";
		RowMapper<Ders> row_mapper = new RowMapper<Ders>()
		{
			@Override
			public Ders mapRow(ResultSet result, int rowNum) throws SQLException
			{
				return new Ders(result.getLong(1), result.getLong("ogretmen_id"), result.getLong("konu_id"));
			}
		};
		liste = jdbcTemplate.query(sql, row_mapper);
		return liste;
	}

	public Ders getById(long id)
	{
		String sql = "SELECT * FROM \"obsh\".\"ders\" WHERE \"id\" = :ID";
		RowMapper<Ders> row_mapper = new RowMapper<Ders>()
		{
			@Override
			public Ders mapRow(ResultSet result, int rowNum) throws SQLException
			{
				return new Ders(result.getLong(1), result.getLong("ogretmen_id"), result.getLong("konu_id"));
			}
		};
		Map<String, Object> paramMap = new HashMap();
		paramMap.put("ID", id);
		return namedParameterJdbcTemplate.queryForObject(sql, paramMap, row_mapper);
	}

	public List<DersDTO> getAllDTO()
	{
		List<DersDTO> liste;
		String sql = "SELECT DRS.\"id\", OGR.\"name\" AS OGRETMEN_ADI, KN.\"name\" AS DERS_KONUSU "
				+ "FROM obsh.ders AS DRS "
				+ "INNER JOIN obsh.OGRETMEN AS OGR ON OGR.\"id\" = DRS.\"ogretmen_id\" "
				+ "INNER JOIN obsh.KONU AS KN ON KN.\"id\" = DRS.\"konu_id\"";
		RowMapper<DersDTO> row_mapper = new RowMapper<DersDTO>()
		{
			@Override
			public DersDTO mapRow(ResultSet result, int rowNum) throws SQLException
			{
				// Ogretmen o;
				// Konu k;
				return new DersDTO(result.getLong("id"), result.getString("OGRETMEN_ADI"), result.getString("DERS_KONUSU"));
			}
		};
		liste = jdbcTemplate.query(sql, row_mapper);
		return liste;
	}


	public boolean save(Ders ders)
	{
		String sql = "INSERT INTO \"obsh\".\"ders\" (\"ogretmen_id\", \"konu_id\") VALUES (:OGR_ID, :KONU_ID)";
		Map<String, Object> paramMap = new HashMap();
		paramMap.put("OGR_ID", ders.getOGR_ID());
		paramMap.put("KONU_ID", ders.getKONU_ID());
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
	}
}

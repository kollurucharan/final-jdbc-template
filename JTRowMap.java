package springii;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class JTRowMap implements RowMapper<ModelClass> {
	public ModelClass mapRow(ResultSet rs, int i) throws SQLException {

		ModelClass mc = new ModelClass();

		mc.setId(rs.getInt(1));
		mc.setName(rs.getString(2));
		mc.setDepartment(rs.getString(3));
		mc.setSalary(rs.getInt(4));
		return mc;
	}

}


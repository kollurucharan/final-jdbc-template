package springii;



import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAOClass implements DAOInterface {

	JdbcTemplate jt;

	@Autowired
	public DAOClass(DataSource ds) {
		jt = new JdbcTemplate(ds);
	}

	public ModelClass first() {
		return jt.queryForObject("select * from empp_pp limit 1;", new JTRowMap());
	}
	public ModelClass last() {
		return jt.queryForObject("select * from empp_pp LIMIT 1 OFFSET (SELECT COUNT(*) - 1 FROM empp_pp)", new JTRowMap());
	}
	public List<ModelClass> start() {
		return jt.query("select * from empp_pp ", new JTRowMap());
	}
	public void edit(ModelClass m) {
		
		Object[] params= {m.getName(),m.getDepartment(),m.getSalary(),m.getId()};
		
		 jt.update("update empp_pp set name=?,job=?,salary=? where id=?;",params);
		
	}
	public void add(ModelClass m) {
		Object[] params= {m.getId(),m.getName(),m.getDepartment(),m.getSalary()};
		 jt.update("insert into empp_pp values(?,?,?,?);",params );
	}
	public void del(ModelClass m) {
		Object[] params= {m.getId()};
		 jt.update("DELETE FROM empp_pp WHERE id = ?;",params  );
	}
	
}


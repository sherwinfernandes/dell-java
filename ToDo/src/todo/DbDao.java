package todo;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDao extends Dao {

	private Connection connection;
	private Statement statement;

	// constructor
	public DbDao() {
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:dbdao.db");
			statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.
			statement.executeUpdate("drop table if exists todo");
			statement.executeUpdate(
					"create table if not exists todo (id integer Primary key Autoincrement, desc text, completed integer)");
		} catch (

		SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		}
	}

	@Override
	public boolean update(int id, String newdesc) {
		// update the description of an item
		try {
			statement.executeUpdate("update todo set desc =\"" + newdesc + "\" where id = " + id);
			return true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return false;

	}

	@Override
	public boolean update(int id, boolean done) {
		// Update the completed status of an item
		try {
			int completed;
			if (done)
				completed = 1;
			else
				completed = 0;
			statement.executeUpdate("update todo set completed = " + completed + " where id = " + id);
			return true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return false;

	}

	@Override
	public boolean add(ToDoItem toAdd) {
		// Add a Todo item to the list
		try {
			int completed;
			if (toAdd.isCompleted())
				completed = 1;
			else
				completed = 0;
			statement.executeUpdate(
					"insert into todo (desc, completed) values( \"" + toAdd.getDesc() + "\" , " + completed + ")");
			return true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return false;

	}

	@Override
	public boolean delete(int id) {
		// delet an item 
		try {
			statement.executeUpdate("delete from todo where id = " + id);
			return true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return false;

	}

	@Override
	public List<ToDoItem> list(boolean listCompleted, boolean listIncomplete) {
		// TODO Auto-generated method stub
		List<ToDoItem> ret = new ArrayList<>();
		try {
			ResultSet rs=null;
			if (listCompleted && listIncomplete)
				rs=statement.executeQuery("select * from todo");
			else if (listCompleted && !listIncomplete)
				rs=statement.executeQuery("select * from todo where completed= 1");
			else if (!listCompleted && listIncomplete)
				rs=statement.executeQuery("select * from todo where completed= 0");
			else return null;
			while (rs.next()) {
				// read the result set
				boolean completed;
				if (rs.getInt("completed") == 0)
					completed = false;
				else
					completed = true;
				ret.add(new ToDoItem(rs.getInt("id"), rs.getString("desc"), completed));
			}
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		}
		return ret;
	}

}

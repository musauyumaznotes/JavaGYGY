
public class Main {

	public static void main(String[] args) {
		
		ISqlProvider sqlProvider = new OracleSqlProvider();
		ISqlProvider sqlProvider1 = new SqlServerProvider();
		ISqlProvider sqlProvider2 = new PostgreSqlProvider();
		
		
		sqlProvider.GetAll();
		sqlProvider1.GetAll();
		sqlProvider2.GetAll();
	}

}
